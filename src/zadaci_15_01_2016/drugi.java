package zadaci_15_01_2016;

/*
 * 
 * Pretpostavimo da su slova A, E, I, O i U samoglasnici. (Smjela pretpostavka, znam) 
 * Napisati program koji pita korisnika da unese string te mu ispište broj samoglasnika i 
 * suglasnika u datom stringu.
 */

import java.util.Scanner;

public class drugi {

	public static void main(String[] args) {
		// Kreiraj skener objekat
		Scanner ulaz = new Scanner(System.in);
		String str;
		// izvriste unos stringa:
		System.out.println("Unesite string");
		str = ulaz.nextLine();
		// incijalizuj brojace
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		int suglas;
		int praz=0;

		// prebacite string u niz

		char[] strniz = str.toCharArray();

		// Ispitajte uslov koliko je samoglasnika u stringu
		for (int j = 0; j < strniz.length; j++) {
			// ukoliko je elemenat stringa jednak samoglasinu a,izvrisi
			// inkrement brojaca "a"
			// po ovoj logici uraditi i za ostale
			if (strniz[j] == 'a') {
				a++;
			}
			if (strniz[j] == 'e') {
				e++;
			}
			if (strniz[j] == 'i') {
				i++;
			}
			if (strniz[j] == 'o') {
				o++;
			}
			if (strniz[j] == 'u') {
				u++;
			}
			if (strniz[j] == ' ') {
				praz++;
			}

		}
		// suglasnike cemo dobit tako sto od duzine strigna oduzmemo zbir
		// samoglasnika i broj praznih mjesta

		suglas = (str.length() - (a + e + i + u + o + praz));

		// ispisi rezultat

		System.out.println("Ukupan broj suglasnika je: " + suglas
				+ "\nukupan broj samoglasnika a je: " + a
				+ "\nukupan broj samoglasnika i je: " + i
				+ "\nukupan broj samoglasnika o je: " + o
				+ "\nukupan broj samoglasnika e je: " + e
				+ "\nukupan broj samoglasnika u je: " + u);
	}

}
