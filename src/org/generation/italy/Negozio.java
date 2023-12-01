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
	
	public void InserimentoProdotto(String codice, String descrizione, float prezzo, int quantitàDisponibile) {
		Prodotto prodInserito=new Prodotto(codice,descrizione,prezzo,quantitàDisponibile);
		listaProdotti.add(prodInserito);
		System.out.println("L'oggetto "+ prodInserito.getCodice()+ "è stato inserito correttamente alla lista prodotti");
    }
	
	public void ElencoProd() {
		System.out.println("Elenco prodotti: \n\n");
		for(Prodotto prod :listaProdotti) {
			System.out.println("codice: "+prod.getCodice()+"\nDescrizione: "+prod.getDecsizione()
			+"\nPrezzo: €"+prod.getPrezzo()+"\nsconto: "+prod.getSconto()+"%\nQuantità: "+prod.getQuantitàDisponibile());
		}
	}
	public void ApplicaSconto(float sconto,String codiceProdotto) {
		for(Prodotto prod : listaProdotti) {
			if(prod.getCodice().equals(codiceProdotto))
				prod.setSconto(sconto);
			return;
		}
		System.out.println("prodotto non trovato");
	}
	Scanner sc=new Scanner(System.in);
	public void VenditaProdotti() {

		ElencoProd();
		System.out.println("Inserisci il prodotto che si vuole acquistare");
		String prodottoScelto=sc.nextLine();
		for(Prodotto prod : listaProdotti) {
			if(prod.getDecsizione().equals(prodottoScelto)) {
				System.out.println("Inserisci la quantità desiderata");
				int unità = Integer.parseInt(sc.nextLine());
				if(unità<=prod.getQuantitàDisponibile()) {
					prod.setQuantitàDisponibile(unità);
				    carrello.add(prod);
				    System.out.println("");
				}	
				else
					System.out.println("Quantità disponibile non sufficente");
			}
			else
				System.out.println("Prodotto non trovato");
		}
		}
	
	public void listaCarrello() {
		System.out.println("Il carrello attualmente è: ");
		for(Prodotto prod : carrello) {
			System.out.println("codice: "+prod.getCodice()+"\nDescrizione: "+prod.getDecsizione()
			+"\nPrezzo: €"+prod.getPrezzo()+"\nsconto: "+prod.getSconto()+"%\nQuantità: "+prod.getQuantitàDisponibile());
		}
	}
}
