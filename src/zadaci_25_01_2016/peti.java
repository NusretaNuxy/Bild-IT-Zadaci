package zadaci_25_01_2016;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Napisati program koji uèitava neodreðen broj cijelih brojeva, odreðuje koliko je 
 * pozitivnih brojeva korisnik unijeo, koliko negativnih te izraèunava ukupnu sumu i 
 * prosjek svih unesenih brojeva. (Korisnik prekida unos tako što unese nulu). 
 * Na primjer, ukoliko korisnik unese 1 2 -1 3 0 program treba da ispiše da je broj 
 * pozitivnih brojeva 3, negativnih brojeva 1, suma ili zbir su 5.0 a prosjek svih brojeva 
 * je 1.25.
 */

public class peti {

	public static void main(String[] args) {
		// kreiraj varijable za brojac pozitivnih,negativnih brojeva
		// kreiraj varijable za sumu i broj
		int brNeg = 0;
		int brPoz = 0;
		int suma = 0;
		int broj;

		Scanner ulaz = new Scanner(System.in);
		// ispisi korisniku poruku
		System.out.println("Unesite brojeve --unos prekidamo nulom-- ");
		// vrsi unos brojeva sve dok je unos razlicit od 0
		do {
			broj = ulaz.nextInt();
			// svaki uneseni broj dodaj sumi
			suma += broj;
			// ako je broj negativan povecaj brojac brNeg za 1
			if (broj < 0) {
				brNeg++;
				// ako je broj pozitivan povecaj brojac brPoz za 1
			} else {
				brPoz++;
			}

		} while (broj != 0);
		// izracunaj prosjek
		// kada korisnik unese 0 za prekid program povecava vrijednost brojaca
		// brPoz za 1,zato u formulu moramo oduzeti 1

		double prosjek = (double) suma / (brPoz + brNeg - 1);
		// ispisi rezultat
		System.out.println("Broj pozitivnih brojeva: " + (brPoz - 1)
				+ "\nBroj negativnih brojeva: " + brNeg + "\nSuma brojeva je: "
				+ suma + "\nProsjek: " + prosjek);

	}

}
