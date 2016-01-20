package zadaci_19_01_2016;

import java.util.Scanner;
import java.util.Random;

/*
 * 
 *  Napisati program koji simulira nasumièno izvlaèenje karte iz špila od 52 karte. 
 *  Program treba ispisati koja karta je izvuèena. 
 *  A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q ili K) te znak u kojem je data karta 
 *  (Srce, Pik, Djetelina, Kocka). Primjer: Karta koju ste izvukli je 10 u znaku kocke. 
 * 
 */

public class drugi {

	public static void main(String[] args) {

		// klasa random se nalazi u paketu java.util
		java.util.Random rn = new java.util.Random();

		// definisemo string sa znakove
		String[] znakovi = { "Srce", "Pik", "Djetelina", "Kocka" };
		// definisemo string za karte
		String[] karte = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "2",
				"10", "J", "Q", "K" };
		// pozivamo random klasu na stirng znakovi
		String znak = znakovi[rn.nextInt(znakovi.length)];

		// pozivamo random klasu na string karte
		String karta = karte[rn.nextInt(karte.length)];

		// ispisimo rezultat
		System.out.println("Karta koju ste izvukli je: " + karta + " u znaku "
				+ znak);

	}

}
