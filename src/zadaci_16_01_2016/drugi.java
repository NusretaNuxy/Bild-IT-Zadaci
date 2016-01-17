package zadaci_16_01_2016;

/*
 * 
 * Napisati metodu koja prima jedan argument, broj pitanja, te generiše toliko nasumiènih, 
 * jednostavnih pitanja oduzimanja tipa : „Koliko je 5 - 2 ?“. Metoda treba da broji broj 
 * taènih i netaènih odgovora te ih ispiše korisniku.
 */

import java.util.Scanner;

public class drugi {
	// kreiraj metodu koja prima jedan argument

	public static void kviz(int br) {
		Scanner ulaz = new Scanner(System.in);
		int br1, br2; // deklariši dvije varijable za nasumiène brojeve
		int brojacT = 0; // deklariši brojaè za taène odgovore
		int brojacN = 0;// deklariši brojaè za netaène odgovore
		int i = 1; // deklariši varijablu za brojaè petlje while

		while (i <= br) {// vrti petlju sve dok je broj odgovora manji od
							// proslijeðenog
			
			// generiši dva nasumièna broja vrijednosti od 0 do 9
			br1 = (int) (Math.random() * 10);
			br2 = (int) (Math.random() * 10);

			// ukoliko je prvi broj manji od drugog,zamijeni brojeve
			if (br1 < br2) {
				int privremena = 0;
				privremena = br1;
				br1 = br2;
				br2 = privremena;

			}
			// izraèunaj razliku generisanih brojeva
			int razlika = (int) (br1 - br2);

			// pitaj korisnika za razliku brojeva
			System.out.println("Unesite razliku broja " + br1 + " i "
					+ " broja " + br2);
			// izvrši unos odgovora
			int razlikaKorisn = ulaz.nextInt();

			// ako je razlika ista kao i korisnikov odgovor brojac tacnih
			// odgovora poveèaj za 1
			if (razlika == razlikaKorisn) {
				brojacT++;
			}

			// ako je razlika razlièita od korinikovog odgovora broj netaènih
			// odgovora povecaj za 1
			if (razlika != razlikaKorisn) {
				brojacN++;
			}
			// inkrement brojaèa petlje
			i++;

		}
		// ispiši rezultat
		System.out.println("Broj TAÈNIH odgovora je:" + brojacT
				+ "\nBroj NETAÈNIH odgovora je: " + brojacN);

	}

	public static void main(String[] args) {
		// izvrši unos broja pitanja
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Broj pitanja: ");
		int broj = ulaz.nextInt();
		
		// pozovi metodu kviz
		kviz(broj);

	}

}
