package zadaci_30_01_2016;

import java.util.Scanner;

/*
 * 
 * Napisati program koji pita korisnika da unese Social Security Number (SSN) u 
 * formatu DDD-DD-DDDD gdje D predstavlja broj. Program treba da provjerava da li je broj 
 * unesešen u ispravnom formatu. Ukoliko nije, program pita korisnika da pokuša ponovo. 
 * Ukoliko jeste unešen u pravom formatu, program završava sa radom.
 */

public class treci {

	public static void main(String[] args) {
		// ispisi korisniku poruku i ivrsi unos ssn broj
		Scanner ulaz = new Scanner(System.in);
		System.out
				.println("Unesite Vas ssn u formatu DDD-DD-DDDD gdje D predstavlja broj:");
		String ssn = ulaz.nextLine();
		// prebaci string u niz
		char[] SSN = ssn.toCharArray();
		// ispitaj da li je na odgovarajucim mjestima broj ili crtica
		if ((Character.isDigit(SSN[0])) && (Character.isDigit(SSN[1]))
				&& (Character.isDigit(SSN[2])) && (SSN[3] == '-')
				&& (Character.isDigit(SSN[4])) && (Character.isDigit(SSN[5]))
				&& (SSN[6] == '-') && (Character.isDigit(SSN[7]))
				&& (Character.isDigit(SSN[8])) && (Character.isDigit(SSN[9]))
				&& (Character.isDigit(SSN[10]))) {
			// ako su svi uslov tacni ispisi poruku
			System.out.println("Uneseni ssn je ispravan.");
		} else {
			// ako jedan ili vise uslova nije tacan ispisi poruku
			System.out.println("\nUneseni ssn nije ispravan.");

		}

	}
}
