package zadaci_26_01_2016;

import java.util.Scanner;

/*
 * 
 *  Napisati program koji pita korisnika da unese dva cijela, pozitivna broja te ispisuje 
 *  najveæi i najmanji zajednièki djelilac za ta dva broja.
 */

public class drugi {
	// kreiraj metodu za pronalazak najveceg zajednickog djelioca
	public static int najveci(int a, int b) {
		// kreiraj varijablu max
		int max = 0;
		// kreiraj petlju koja ce za svaki "j" provjeriti djelioce
		// ako je prvi broj veci od drugog izvrsi tijelo petlje
		if (a < b) {
			for (int j = 1; j < a; j++) {
				// ispitaj da li su "a" i "b" djeljivi sa "j"
				if ((a % j) == 0 && (b % j == 0)) {
					// ako jesu ispitaj da li je "j" vece ili jednako od max-a
					if (j >= max) {
						// varijabli max dodijeli vrijednost "j"
						max = j;
					}
				}
			}
		}
		// isto tijelo petlje kao i prethodna pretlja,samo u ovom slucaju prvi
		// uneseni broj je veci od drugog
		if (a > b) {
			for (int j = 1; j < b; j++) {
				// ispitaj da li je "a" djeljivo sa "j"
				if ((b % j) == 0 && (a % j == 0)) {
					if (j >= max) {
						max = j;
					}
				}
			}
		}
		// vrati vrijednost varijable max
		return max;
	}

	// kreiraj metodu za pronalazak najmanjeg zajednickog djelioca
	// identicno kao i prethodne petlje i uslovi
	public static int najmanji(int a, int b) {
		int min = 0;
		if (a < b) {
			min = a;
			// kreiraj petlju koja ce za svaki "j" provjeriti djelioce
			for (int j = 1; j < a; j++) {
				// ispitaj da li je "a" djeljivo sa "j"
				if ((a % j == 0) && (b % j == 0)) {
					if (j < min) {
						min = j;
					}
				}
			}
		}

		if (a > b) {
			min = b;
			// kreiraj petlju koja ce za svaki "j" provjeriti djelioce
			for (int j = 1; j < b; j++) {
				// ispitaj da li je "a" djeljivo sa "j"
				if ((a % j == 0) && (b % j == 0)) {
					if (j < min) {
						min = j;
					}
				}
			}
		}
		return min;
	}

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		// Unesite prvi cijeli broj od korisnika
		System.out.print("Unesite cijeli broj:");
		int broj1 = ulaz.nextInt();
		// Unesite drugi cijeli broj od korisnika
		System.out.println("Unesite drugi cijeli broj:");
		int broj2 = ulaz.nextInt();
		// Ispisi rezultat o najvecem zajednickom djel.
		System.out.println("Najveci zajednicki djelilac je: "
				+ najveci(broj1, broj2));
		// Ispisi rezultat o najmanjem zajednickom djel.
		System.out.println("Najmanji zajednicki djelilac je: "
				+ najmanji(broj1, broj2));

	}

}
