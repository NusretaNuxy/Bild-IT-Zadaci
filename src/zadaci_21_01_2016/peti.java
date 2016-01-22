package zadaci_21_01_2016;

/*
 * 
 * Neke web stranice forsiraju odreðena pravila za passworde. Napisati metodu koja 
 * provjerava da li je unijeti string validan password. Pravila da bi password bio validan 
 * su sljedeæa: 
 * 1. Password mora biti saèinjen od najmanje 8 karaktera. 
 * 2.Password smije da se sastoji samo od slova i brojeva. 
 * 3. Password mora sadržati najmanje 2 broja. 
 * Napisati program koji pita korisnika da unese password te mu ispisuje "password je validan" 
 * ukoliko su sva pravila ispoštovana ili "password nije validan" ukoliko pravila nisu 
 * ispoštovana.
 */

import java.util.Scanner;

public class peti {
	// kreirak metodu koja ce ispitati da li password sastoji samo od slova i
	// brojeva
	public static boolean slovBroj(String loz) {
		// prebaci password u niz
		char[] pass = loz.toCharArray();
		// kreiraj petlju za prolazak kroz niz
		for (int i = 0; i < loz.length(); i++) {
			// ispitaj da li je password veliko, malo slovo ili broj
			// ispitivane izvrsi preko ASCII tabele
			if ((pass[i] >= 65 && i <= 90) || (pass[i] >= 97 && i <= 122)
					|| (pass[i] >= 48 && i <= 57)) {
				return true;// vrati tacno je tacan uslov
			}
		}

		return false;// u suprtnom vrati false

	}

	// kreiraj metodu koja ce ispitati da li password sadrzi najmanje dva broja

	public static boolean dvaBr(String loz) {
		// prebaci string u niz
		char[] pass = loz.toCharArray();
		int br = 0;// kreiraj i deklarisi varijablu za brojac
		// kreiraj petlju za prolazak kroz niz
		for (int i = 0; i < loz.length(); i++) {
			// ispitaj preko ASCII tabele da li je i-ti elemenat niza jednak
			// broju
			if (pass[i] >= 48 && pass[i] <= 57) {
				br++;// ako jest uradi inkrement brojaca
			}
		}
		// ako su bila visa od dva broja tj.ako je broac veci ili jednak 2 vrati
		// true
		if (br >= 2) {
			return true;
			// u suprotnom vrati false
		} else {

			return false;
		}

	}

	public static void main(String[] args) {
		// unesite lozinku
		Scanner ulaz = new Scanner(System.in);

		System.out.println("unesite lozinku");
		String lozinka = ulaz.nextLine();
		// ispitaj uslov da li je lozinka veca ili jednaka od 8 znakova i pozovi
		// metode za ostale uslove
		if ((lozinka.length() >= 8) && (slovBroj(lozinka)) && (dvaBr(lozinka))) {
			// ako su uslovi tacni ispisi lozinka je dobra
			System.out.println("Lozinka JE dobra");
		} else {
			// ako je jedan ili vise uslova netacan ispisi lozinka nije dobra
			System.out.println("Lozinka NIJE dobra");
		}

	}

}
