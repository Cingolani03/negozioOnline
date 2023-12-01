package org.generation.italy;

import java.util.Scanner;

public class Main {
	public void main() {
		Scanner sc=new Scanner(System.in);
		String sceltaOp;
		System.out.println("Benvenuto nel negozio online. Definisci gli oggetti che vuoi inserire tra i prodotti");
		Negozio Nike =new Negozio();
		
		Nike.InserimentoProdotto("StS001","T-Shirt taglia s",38,5);
		Nike.InserimentoProdotto("StS002","T-Shirt taglia L",35,6);
		Nike.InserimentoProdotto("StS003","T-Shirt taglia M",40,7);
		
		while(true) {
			System.out.println("quale operazione vuoi eseguire? \n[1]-Inserimento prodotto "
					+ "\n[2]-Inserisci nel carrello \n[3]-Mostra carrello \n[4]-Aquista");
			sceltaOp=sc.nextLine();
			
			switch(sceltaOp) {
			case 1:
				System.out.println("Inserimento del prodotto: \n Codice: ");
				String codice = sc.nextLine();
				System.out.println("\nDescrizione: ");
				String descrizione =sc.nextLine();
				System.out.println("\nCosto: ");
				float prezzo =Float.parseFloat(sc.nextLine());
				System.out.println("\nQuantità disponibile");
				int quantitàDisponibile=Integer.parseInt(sc.nextLine());
				float sconto = Float.parseFloat(sc.nextLine());
				if(sconto>0) {
					Nike.ApplicaSconto(sconto, codice);
					prezzo=prezzo-(prezzo*(sconto/100));
				}
				Nike.InserimentoProdotto(codice, descrizione, prezzo, quantitàDisponibile);
				break;
			case 2:
				Nike.ElencoProd();
				break;
				
			case 3:
				Nike.VenditaProdotti();
				break;
				
			case 4:
				Nike.listaCarrello();
				break;
				
			case 5:
				
			}
		}
	}
}
