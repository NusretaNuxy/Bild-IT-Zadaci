package zadaci_19_01_2016;

import java.util.Scanner;

/*
 * 
 * Napisati metodu koja broji slova u stringu. Metoda treba koristiti sljedeæi header: 
 * public static int countLetters(String s). 
 * Napisati program koji pita korisnika da unese neki string te mu vrati koliko taj 
 * string ima slova. 
 * 
 */

public class peti {
	// kreiraj metodu
	public static int countLetters(String s) {

		char prpolje = ' ';// kreiraj string prazno polje
		int br = 0;// kreiraj varijablu za brojac i postavi je na nulu
		char[] string = s.toCharArray();// prebaci string u red

		for (int i = 0; i < string.length; i++) {// kreiraj petlju za prolazak
													// kroz red
			if (string[i] == prpolje && string[i + 1] != prpolje) {// Ukoliko se
																	// u nizu
																	// nalazi
																	// jedno ili
																	// dva
																	// susjedna
																	// prazna
																	// polja,
																	// brojac
																	// povecaj
																	// za 1
				br++;
			}
		}
		int duzinaS = s.length();// izracunaj duzinu stringa
		int ukupno = duzinaS - br;// rezultat = duzina sringa minus prazna polja
		return ukupno;// vrati rezultat

	}

	public static void main(String[] args) {
		// Unesi string
		Scanner ulaz = new Scanner(System.in);
		String str;
		System.out.println("unesite tekst:");
		str = ulaz.nextLine();
		// ispisi rezultat i pozovo metodu
		System.out.println("U stringu imamo " + countLetters(str) + " slova!");
	}

}
