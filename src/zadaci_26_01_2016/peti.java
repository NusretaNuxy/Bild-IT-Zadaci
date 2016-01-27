package zadaci_26_01_2016;

import java.util.Scanner;

/*
 *  Napisati program koji uèitava cijele brojeve u rasponu od 1 do 100 te broji i 
 *  ispisuje koliko je koji broj puta unijet. Pretpostavimo da nula prekida unos brojeva. 
 *  Ukoliko unesemo sljedeæi niz brojeva 2 5 6 23 42 58 2 6 0 program nam ispisuje da se 
 *  broj 2 ponavlja 2 puta, broj 5 jednom, broj 6 2 puta, broj 23 jednom, itd. 
 */

public class peti {

	public static void main(String[] args) {
		// kreiraj niz brojeva od 1 do 100
		int[] niz = new int[100];
		// kreiraj niz za brojace
		int[] br = new int[100];
		int broj;
		// dodijeli elemente nizu "niz"
		for (int i = 0; i < 100; i++) {
			niz[i] = i + 1;

		}
		// ispisi poruku korisniku da unese cijele brojeve
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite cijele brojeve:");
		// vrsi unos sve dok je razlit od 0
		do {
			broj = ulaz.nextInt();
			for (int i = 0; i < 100; i++) {
				if (broj == niz[i]) {
					br[i]++;
				}
			}

		} while (broj != 0);
		// ispisi poruku korisniku
		System.out.println("Unijeli ste slijedeæe brojeve:");
		// ispitaj koji broj je kroisnik unio i povecaj njegov brojac za 1
		for (int i = 0; i < 100; i++) {
			// gdje je niz br[i] razlicit od 0 ispisi poruku
			if (br[i] != 0) {
				System.out.println("Broj " + niz[i] + " ste unijeli: " + br[i]
						+ " puta.");
			}
		}

	}

}
