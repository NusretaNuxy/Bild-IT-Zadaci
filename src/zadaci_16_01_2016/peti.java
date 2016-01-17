package zadaci_16_01_2016;

import java.util.Scanner;

/*
 * 
 * Napisati metodu koja prima jedan argument te simulira bacanje novèiæa toliko puta. 
 * Nakon što se simulacija završi, program ispisuje koliko puta je novèiæ pokazao glavu a 
 * koliko puta pismo.
 */

public class peti {

	public static void bacanje(int x) {

		// kreiraj niz tipa string sa dva elementa
		String niz[] = { "Pismo", "Glava" };
		int pismo = 0;// deklariši brojac za pismo
		int glava = 0;// deklariši brojac za glavu

		// vrti petlju trazeni broj puta
		for (int i = 0; i < x; i++) {
			int y = (int) (Math.random() * 2);// random generisi broj 0 ili 1

			if (niz[y] == "Pismo") {// ukoliko je generisani broj 0,kao index
									// elementa pismo,vrijednost ce biti
									// istinita
				pismo++; // inkremet brojaca
			}
			if (niz[y] == "Glava") {// ukoliko je generisani broj 1,kao index
									// elementa glava,vrijednost ce biti
									// istinita
				glava++;// inkremenet brojaca
			}
		}
		// ispisi rezultat
		System.out.println("Novcic je pokazao " + glava + " puta glava "
				+ "\ndok je pismo pokazao  " + pismo + " puta");

	}

	public static void main(String[] args) {

		// Unos kolièine bacanja
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite koliko puta æe se novcic bacit ");
		int x = ulaz.nextInt();
		// pozovi metodu
		bacanje(x);

	}

}
