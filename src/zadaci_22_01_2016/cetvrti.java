package zadaci_22_01_2016;

import java.util.Scanner;

/*
 * Napišite program koji uèitava neodreðen broj cijelih brojeva (unos prekida nula), 
 * pronalazi najveæi od unijetih brojeva te ispisuje koliko se najveæi broj puta ponovio.  
 * Na primjer, ukoliko unesemo 3 5 2 5 5 5 0 program ispisuje da je najveæi broj 5 te 
 * ispisuje da se isti ponavlja 4 puta. 
 */

public class cetvrti {

	public static void main(String[] args) {
		// kreiraj objekat tipa skener
		Scanner ulaz = new Scanner(System.in);
		// deklarisi brojace za svaki broj od 1 do 9
		int br1 = 0;
		int br2 = 0;
		int br3 = 0;
		int br4 = 0;
		int br5 = 0;
		int br6 = 0;
		int br7 = 0;
		int br8 = 0;
		int br9 = 0;
		// ispisi poruku za unos brojeva
		System.out.println("Unesite cijele brojeve:");
		int broj = ulaz.nextInt();

		// ispitaj unos i povecaj odgovarajuci brojac,npr: ako unesemo prvi broj
		// 9 brojac br9 ce se dekrementovat.U slucaju da ove IF uslove nismo
		// odradili poslije prvog unosa,program bi dao netacan rezultat ako bi
		// prvi uneseni broj bio ujedno i najveci broj
		if (broj == 1) {
			br1++;
		}

		if (broj == 2) {
			br2++;
		}

		if (broj == 3) {
			br3++;
		}

		if (broj == 4) {
			br4++;
		}

		if (broj == 5) {
			br5++;
		}

		if (broj == 6) {
			br6++;
		}

		if (broj == 7) {
			br7++;
		}

		if (broj == 8) {
			br8++;
		}

		if (broj == 9) {
			br9++;
		}
		// zatim kreiraj do - while petlju, i vrsi unos sve dok korisnik ne unese 0,za
		// svaki unos povecaj i odgovarajuci brojac
		do {
			broj = ulaz.nextInt();
			if (broj == 1) {
				br1++;
			}

			if (broj == 2) {
				br2++;
			}

			if (broj == 3) {
				br3++;
			}

			if (broj == 4) {
				br4++;
			}

			if (broj == 5) {
				br5++;
			}

			if (broj == 6) {
				br6++;
			}

			if (broj == 7) {
				br7++;
			}

			if (broj == 8) {
				br8++;
			}

			if (broj == 9) {
				br9++;
			}
		} while (broj != 0);
		// smjesti vrijednosti brojaca u niz
		int[] niz = { br1, br2, br3, br4, br5, br6, br7, br8, br9 };
		// kreiraj dvije varijable jednu za najveci broj,drugu za broj
		// ponavljanja najveceg broja
		int najveci = 0;
		int brPonavljanja = 0;
		// prodji sa petljom for kroz niz
		for (int i = 0; i < niz.length; i++) {
			// ako je vrijednost niza na "i-toj" poziciji veca od
			// prPonavljanja,brPonavljanja je tada jednak vrijednosti niza na
			// "i-toj"poziciji
			if (niz[i] > brPonavljanja) {
				brPonavljanja = niz[i];
			}
			// Ukoliko je "i" vece od vrijednosti varijable "najveci" i ukoliko
			// je
			// vrijednost u nizu na "i-toj" poziciji razlicita od 0,varijabla
			// najveca je jednaka i+1(jer index krece od 0)
			if ((i >= najveci) && (niz[i] != 0)) {
				najveci = i + 1;
			}
		}
		// ispisi rezultat
		System.out.println("Najveci broj je: " + najveci + " , a ponovio se: "
				+ brPonavljanja);
	}

}
