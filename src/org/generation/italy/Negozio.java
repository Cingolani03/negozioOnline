package org.generation.italy;

import java.util.ArrayList;
import java.util.Scanner;

public class Negozio {
	private ArrayList<Prodotto> listaProdotti;
	private ArrayList<Prodotto> carrello;
	
	public Negozio() {
		listaProdotti=new ArrayList<>();
		carrello= new ArrayList<>();
	}
	
	public void InserimentoProdotto(String codice, String descrizione,float sconto, float prezzo, int quantitàDisponibile) {
		System.out.println("Inserimento del prodotto: \n Codice: ");
	    codice = sc.nextLine();
		System.out.println("\nDescrizione: ");
		descrizione =sc.nextLine();
		System.out.println("\nCosto: ");
		prezzo =Float.parseFloat(sc.nextLine());
		System.out.println("\nQuantità disponibile");
		quantitàDisponibile=Integer.parseInt(sc.nextLine());
		sconto = Float.parseFloat(sc.nextLine());
		
		if(sconto>0) {
			//ApplicaSconto(sconto, codice);			
			prezzo=prezzo-(prezzo*(sconto/100));			
		}	
		Prodotto prodInserito=new Prodotto(codice,descrizione,sconto,prezzo,quantitàDisponibile);
		listaProdotti.add(prodInserito);
		System.out.println("L'oggetto "+ prodInserito.getCodice()+ "è stato inserito correttamente alla lista prodotti");
    }
	
	public void ElencoProd() {
		System.out.println("Elenco prodotti: \n\n");
		for(Prodotto prod :listaProdotti) {
			System.out.println("\ncodice: \t\t"+prod.getCodice()+"\nDescrizione: \t\t"+prod.getDecsizione()
			+"\nPrezzo: \t\t€"+prod.getPrezzo()+"\nsconto: \t\t"+prod.getSconto()+"%\nQuantità: \t\t"+prod.getUnitàAcquistate());
		}
	}
//	public void ApplicaSconto(float sconto,String codiceProdotto) {
//		for(Prodotto prod : listaProdotti) {
//			if(prod.getCodice().equals(codiceProdotto))
//				prod.setSconto(sconto);
//			return;
//		}
//	}
	Scanner sc=new Scanner(System.in);
	public void VenditaProdotti() {

		ElencoProd();
		System.out.println("Inserisci il prodotto che si vuole acquistare");
		String prodottoScelto=sc.nextLine();
		for(Prodotto prod : listaProdotti) {
			if(prod.getDecsizione().equals(prodottoScelto)) {
				System.out.println("Inserisci la quantità desiderata");
				float unità = Float.parseFloat(sc.nextLine());
				if(unità<=prod.getQuantitàDisponibile()) {
					prod.setQuantitàDisponibile(unità);
					prod.setUnitàAcquistate(unità);
				    carrello.add(prod);
				    System.out.println("");
				}	
				else
					System.out.println("Quantità disponibile non sufficente");
				return;
			}		
		}
		System.out.println("Prodotto non trovato");
		}
	
	public void listaCarrello() {
		System.out.println("Il carrello attualmente è: ");
		for(Prodotto prod : carrello) {
			System.out.println("codice: \t\t"+prod.getCodice()+"\nDescrizione: \t\t"+prod.getDecsizione()
			+"\nPrezzo: \t\t€"+prod.getPrezzo()+"\nsconto: \t\t"+prod.getSconto()+"%\nQuantità: \t\t"+prod.getQuantitàDisponibile());
		}
	}
	public void costo() {
		float costoTot=0;
		for(Prodotto prod: carrello) {
			 costoTot =prod.getPrezzo()*prod.getUnitàAcquistate();
			 prod.setUnitàAcquistate(0);
		}
		System.out.println(costoTot);
	}
}
