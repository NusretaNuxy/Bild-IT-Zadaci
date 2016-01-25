package zadaci_24_01_2016;

import java.util.Scanner;

/*Napisati metodu koja vraæa broj dana u godini. Metoda koristi sljedeæi header: 
 public static int numberOfDayInAYear(int year). 
 Napisati program koji pita korisnika da unese poèetnu godinu, krajnju godinu te ispisuje broj 
 dana za svaku godinu u rasponu.
 */

public class prvi {
	// kreiraj metodu
	public static int numberOfDayInAYear(int year) {
		// kreiraj varijable a i b
		// varijabli a dodijeli broj dana prijestupne godine
		// varijabli b dodijeli broj dana neprijestupne godine
		int a = 366;
		int b = 365;
		// ispitaj uslov da li je godina prijestupna
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			return a;// ako jest vrati vrijednost varijable a
		} else {
			// ako nije vrati vrijednost varijable b
			return b;
		}

	}

	public static void main(String[] args) {
		// izvrsi unos pocetne i krajnje godine
		Scanner ulaz = new Scanner(System.in);
		System.out.print("Unesite pocetnu godinu: ");
		int pocgod = ulaz.nextInt();
		System.out.print("Unesite krajnju godinu: ");
		int krajgod = ulaz.nextInt();
		// ako je korisnik kao pocetnu godinu unio vecu od krajnje
		// zamijeni vrijednosti varijablama pocgod i krajgod
		if (pocgod > krajgod) {
			int privremena = 0;
			privremena = pocgod;
			pocgod = krajgod;
			krajgod = privremena;
		}
		// kreiraj for petlju od pocetne do krajnje godine
		for (int i = pocgod; i <= krajgod; i++) {
			// ispisi porku i pozovi metodu
			System.out.println("Broj dana u " + i + ".godini je "
					+ numberOfDayInAYear(i));

		}
	}

}
