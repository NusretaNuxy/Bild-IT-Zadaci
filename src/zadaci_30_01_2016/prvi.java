package zadaci_30_01_2016;

import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese cijeli trocifreni broj te provjerava da li 
 * je unijeti broj palindrom. Broj je palindrom ukoliko se èita isto i sa lijeva na desno i 
 * sa desna na lijevo npr. 121, 131, itd.
 */

public class prvi {

	public static void main(String[] args) {
		// ispisi poruku korisniku
		System.out.println("Unesite trocifren broj: ");
		Scanner ulaz = new Scanner(System.in);
		// izvrsi unos broja
		int broj = ulaz.nextInt();
		// dijeli broj sa 100 da dobijemo prvu cifru broja
		int i = broj / 100;
		// izracunaj moduo broja da bi dobili zadnju cifru
		int mod = broj % 10;
		// ako su prva i zadnja iste trocifren broj je polindrom
		if (i == mod) {
			System.out.println("Broj je polindrom!");
		} else {
			System.out.println("Broj nije polindrom!");
		}

	}

}