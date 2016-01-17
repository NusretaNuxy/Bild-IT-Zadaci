package zadaci_16_01_2016;

/*
 * 
 * Napisati metodu koja prima jedan argument, broj pitanja, te generi�e toliko nasumi�nih, 
 * jednostavnih pitanja oduzimanja tipa : �Koliko je 5 - 2 ?�. Metoda treba da broji broj 
 * ta�nih i neta�nih odgovora te ih ispi�e korisniku.
 */

import java.util.Scanner;

public class drugi {
	// kreiraj metodu koja prima jedan argument

	public static void kviz(int br) {
		Scanner ulaz = new Scanner(System.in);
		int br1, br2; // deklari�i dvije varijable za nasumi�ne brojeve
		int brojacT = 0; // deklari�i broja� za ta�ne odgovore
		int brojacN = 0;// deklari�i broja� za neta�ne odgovore
		int i = 1; // deklari�i varijablu za broja� petlje while

		while (i <= br) {// vrti petlju sve dok je broj odgovora manji od
							// proslije�enog
			
			// generi�i dva nasumi�na broja vrijednosti od 0 do 9
			br1 = (int) (Math.random() * 10);
			br2 = (int) (Math.random() * 10);

			// ukoliko je prvi broj manji od drugog,zamijeni brojeve
			if (br1 < br2) {
				int privremena = 0;
				privremena = br1;
				br1 = br2;
				br2 = privremena;

			}
			// izra�unaj razliku generisanih brojeva
			int razlika = (int) (br1 - br2);

			// pitaj korisnika za razliku brojeva
			System.out.println("Unesite razliku broja " + br1 + " i "
					+ " broja " + br2);
			// izvr�i unos odgovora
			int razlikaKorisn = ulaz.nextInt();

			// ako je razlika ista kao i korisnikov odgovor brojac tacnih
			// odgovora pove�aj za 1
			if (razlika == razlikaKorisn) {
				brojacT++;
			}

			// ako je razlika razli�ita od korinikovog odgovora broj neta�nih
			// odgovora povecaj za 1
			if (razlika != razlikaKorisn) {
				brojacN++;
			}
			// inkrement broja�a petlje
			i++;

		}
		// ispi�i rezultat
		System.out.println("Broj TA�NIH odgovora je:" + brojacT
				+ "\nBroj NETA�NIH odgovora je: " + brojacN);

	}

	public static void main(String[] args) {
		// izvr�i unos broja pitanja
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Broj pitanja: ");
		int broj = ulaz.nextInt();
		
		// pozovi metodu kviz
		kviz(broj);

	}

}
