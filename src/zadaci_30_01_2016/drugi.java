package zadaci_30_01_2016;

import java.util.Scanner;

/*
 *  Napisati program koji pita korisnika da unese neki string te mu ispisuje dužinu tog 
 *  stringa kao i prvo slovo stringa.
 */

public class drugi {
	// kreiraj metodu za vracanje prvog slova stringa
	public static char Letter(String s) {
		// prebaci string u niz
		char[] string = s.toCharArray();
		// vrati prvi element niza
		return string[0];

	}

	// kreiraj metodu
	public static int countLetters(String s) {
		// kreiraj string prazno polje
		char prpolje = ' ';
		// kreiraj varijablu za brojac i postavi je na nulu
		int br = 0;
		// prebaci string u red
		char[] string = s.toCharArray();
		// kreiraj petlju za prolazak kroz red
		for (int i = 0; i < string.length; i++) {
			// Ukoliko se u nizu nalazi jedno ili dva susjedna prazna polja
			// povecaj brojac za 1
			if (string[i] == prpolje && string[i + 1] != prpolje) {
				br++;
			}
		}
		// izracunaj duzinu stringa
		int duzinaS = s.length();
		// rezultat = duzina sringa minus prazna polja
		int ukupno = duzinaS - br;
		// vrati rezultat
		return ukupno;

	}

	public static void main(String[] args) {
		// Unesi string
		Scanner ulaz = new Scanner(System.in);
		String str;
		System.out.println("unesite tekst:");
		str = ulaz.nextLine();
		// ispisi rezultat i pozovo metodu
		System.out.println("U stringu imamo " + countLetters(str) + " slova!");
		System.out.println("Prvi slovo u stringu je " + Letter(str));

	}

}
