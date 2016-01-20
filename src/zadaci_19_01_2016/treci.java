package zadaci_19_01_2016;

import java.util.Scanner;

/*
 * 
 * Napisati program koji pita korisnika da unese 2 stringa te ispisuje najve�i zajedni�ki 
 * prefix za ta dva stringa, ukoliko isti postoji. 
 * Na primjer, ukoliko korisnik unese sljede�a dva stringa "Dobrodo�li u Dubai" i 
 * "Dobrodo�li u Vankuver" program treba da ispi�e: 
 * Najve�i zajedni�ki prefix za dva stringa je "Dobrodo�li u". 
 */

public class treci {

	public static void main(String[] args) {
		// izvrsi unos prvog stringa
		Scanner ulaz = new Scanner(System.in);
		String string1, string2;
		System.out.println("unesite prvi string");
		string1 = ulaz.nextLine();
		// izvrsi unos drugog stringa
		System.out.println("unesite drugi string");
		string2 = ulaz.nextLine();

		int br = 0;// kreiraj varijablu za brojac

		char[] str1 = string1.toCharArray();// prebaci prvi string u niz
		char[] str2 = string2.toCharArray();// prebaci drugi string u niz

		if (str1.length < str2.length) {// ukoliko je prvi niz manji od drugog
										// izvrsi tijelo petlje

			for (int i = 0; i < str1.length - 1; i++) {// petlju vrti do duzine
														// manjeg niza(string1)
				if ((str1[i] == str2[i]) && (str1[i + 1] == str2[i + 1])) {// ako
																			// je
																			// na
																			// i-toj
																			// poziciji
																			// string1
																			// jednak
																			// string2,
																			// povecaj
																			// brojac
																			// za
																			// 1
					// ako ne bi stavili i str1[i + 1] == str2[i + 1]) brojac bi
					// se povecao za SVE iste elemnete u stringovima
					br++;// povecaj brojac
				}
			}
		}
		if (str2.length < str1.length) {// ako je string2 manji od stringa 1 -
										// izvr�i tijelo petlje (identicno kao
										// prethodna petlja)
			for (int i = 0; i < str2.length - 1; i++) {
				if ((str1[i] == str2[i]) && (str1[i + 1] == str2[i + 1])) {
					br++;
				}

			}

		}
		// ispisi rezultat

		System.out
				.println("Najve�i zajedni�ki prefix za ukucane stringove je:");

		for (int i = 0; i < br; i++) {// ispisi elemente stringa do vrijednosti brojaca

			System.out.print(str1[i]);
		}

	}
}
