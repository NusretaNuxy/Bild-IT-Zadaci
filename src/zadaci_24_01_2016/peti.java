package zadaci_24_01_2016;

import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese dva stringa te provjerava i ispisuje da 
 * li je drugi string substring prvog stringa. 
 * Na primjer, ukoliko korisnik unese ABCD kao prvi string a BC kao drugi string 
 * program mu ispisuje da je BC substring ABCD stringa.
 */
public class peti {
	// Kreiraj metodu za poreðenje stringova
	public static boolean poredi(String a, String b) {
		// prebci stringove u nizove
		char[] stra = a.toCharArray();
		char[] strb = b.toCharArray();

		// The java string contains() method searches the sequence of characters
		// in this string. It returns true if sequence of char values are found
		// in this string otherwise returns false.
		if (a.contains(b)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		// izvrsite unos stringa
		System.out.print("Unesite string ");
		String str = ulaz.nextLine();
		// izvrsi unos substringa
		System.out.print("Unesite substring ");
		String substr = ulaz.nextLine();
		// ako metoda vrati true ispisi poruku
		if (poredi(str, substr) == true) {
			System.out.print("String " + substr + " JE substring stringa "
					+ str);
			// ako metoda vrati false ispisi poruku
		} else {
			System.out.print("String " + substr + " NIJE substring stringa "
					+ str);
		}

	}
}
