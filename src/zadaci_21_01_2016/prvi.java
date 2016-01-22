package zadaci_21_01_2016;

import java.util.Scanner;

/*
 * 
 * Napisati program koji ispisuje tri nasumièna cijela broja te pita korisnika da unese 
 * njihov zbir. Ukoliko korisnik pogriješi, program ispisuje pitanje ponovo sve sa porukom da 
 * pokuša ponovo.  
 * Ukoliko korisnik unese taèan odgovor, program mu èestita i završava sa radom. 
 */

public class prvi {

	public static void main(String[] args) {
		// izvrsi unos prvog broja
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite prvi broj:");
		int broj1 = ulaz.nextInt();
		// izvrsi unos drugog broja
		System.out.println("Unesite drugi broj:");
		int broj2 = ulaz.nextInt();
		// izvrsi unos treceg broja
		System.out.println("Unesite treci broj:");
		int broj3 = ulaz.nextInt();
		// saberi unesene brojeve
		int zbir = broj1 + broj2 + broj3;
		// ispisi poruku
		System.out.println("Ukucali ste slijedece brojeve:\n" + broj1 + ", "
				+ broj2 + " , " + broj3 + "\nUnesite zbir ovih brojeva:");
		// unesi rezultat od korisnika
		int rez = ulaz.nextInt();
		// ako je rezultat jednak zbiru ispisi poruku
		if (rez == zbir) {
			System.out.println("CESTITAMO!Rezultat je tacan!");
		}
		// ako rezultat nije jednak zbiru izvrsi tijelo else petlje
		else {
			// ponavljaj pitanje sve dok je unos razlicit od tacnog rezultata
			do {
				System.out.println("REZULTAT NETACAN!Pokusajte ponovo:");
				rez = ulaz.nextInt();

			} while (rez != zbir);
			// ispisi poruku
			System.out.println("CESTITAMO!Rezultat je tacan!");
		}

	}
}
