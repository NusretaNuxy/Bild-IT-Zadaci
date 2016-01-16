package zadaci_15_01_2016;

import java.util.Scanner;

/*
 * 
 * Napisati metodu koja prima dva cijela broja kao argumente te vraæa najveæi zajednièki 
 * djelilac za ta dva broja.
 * PRIMJER:
 * Unesite prvi broj: 125
 * Unesite drugi broj: 2525
 * Najveæi zajednièki djelilac za brojeve 125 i 2525 je 25.
 */
public class treci {
	// kreiraj metodu

	public static void najveci(int x, int y) {

		// deklarisi varijablu max
		int max = 0;
		
		//ukoliko je prvi broj manji od drugog,petlju pravimo do prvog broja
		if (x < y) {
			for (int i = 1; i < x; i++) {
				if ((x % i == 0) && (x % i == 0)) {
					max = i;
				}
			}
		}
		//ukoliko je drugi broj manji od prvog,petlju pravimo do drugog broja
		if (y < x) {
			for (int i = 1; i <y; i++) {
				if ((x % i == 0) && (x % i == 0)) {
					max = i;
				}
			}
		}
		// ispisi rezultat
		System.out.println("Maksimalni djelilac broja " + x + "\ni broja " + y
				+ " je " + max);

	}

	public static void main(String[] args) {
		// Kreirajmo objekat tipa skener
		Scanner ulaz = new Scanner(System.in);

		// izvrisite unos dva broja
		System.out.println("Unesite dva broja");
		int broj1 = ulaz.nextInt();
		int broj2 = ulaz.nextInt();

		// pozovimo metodu
		najveci(broj1, broj2);

	}

}
