package zadaci_16_01_2016;

import java.util.Scanner;

/*
 * 
 * Napisati metodu koja prima jedan argument te simulira bacanje nov�i�a toliko puta. 
 * Nakon �to se simulacija zavr�i, program ispisuje koliko puta je nov�i� pokazao glavu a 
 * koliko puta pismo.
 */

public class peti {

	public static void bacanje(int x) {

		// kreiraj niz tipa string sa dva elementa
		String niz[] = { "Pismo", "Glava" };
		int pismo = 0;// deklari�i brojac za pismo
		int glava = 0;// deklari�i brojac za glavu

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

		// Unos koli�ine bacanja
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite koliko puta �e se novcic bacit ");
		int x = ulaz.nextInt();
		// pozovi metodu
		bacanje(x);

	}

}
