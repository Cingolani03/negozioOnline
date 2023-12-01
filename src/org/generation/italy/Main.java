package org.generation.italy;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int sceltaOp;
		System.out.println("Benvenuto nel negozio online. Definisci gli oggetti che vuoi inserire tra i prodotti");
		Negozio Nike =new Negozio();
		
		boolean chek=true;
//		Nike.InserimentoProdotto("001", "maglia", 0, 30, 5);
//		Nike.InserimentoProdotto("002", "gaicca", 0, 50, 6);
//		Nike.InserimentoProdotto("003", "pantalone", 0, 40, 7);
		while(chek) {
			System.out.println("quale operazione vuoi eseguire? \n[1]-Inserimento prodotto "
					+ "\n[2]-Mostra prodotti disponiobili \n[3]-Inserisci nel carrello \n[4]-Mostra carrello"
					+ " \n[5]-Aquista\n[6]-esci");
			System.out.println("pzione");
			sceltaOp=Integer.parseInt(sc.nextLine());
			
			switch(sceltaOp) {
			case 1:
				Nike.InserimentoProdotto(null,null,0,0,0);
				break;
			case 2 :
				Nike.ElencoProd();
				break; 
				
			case 3:
				Nike.VenditaProdotti();
				break;
				
			case 4:
				Nike.listaCarrello();
				break;
				
			case 5:
				System.out.println("\nIl costo totsle dell'ordine è: €");
				Nike.costo();
				case 6:
					chek=false;
				break;
				default:
					System.out.println("Operazione non disponibile");
					break;
			}
		}
	}
}
