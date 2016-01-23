package zadaci_22_01_2016;

import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese cijeli broj za današnji dan u sedmici 
 * (0 za ponedjeljak, 1 za utorak...) i da unese broj dana nakon današnjeg dana te mu ispiše 
 * koji je to dan u buduænosti. 
 * (Primjer: ako korisnik unese 1 kao današnji dan a 3 kao dan u buduænosti program mu 
 * ispisuje da je danas utorak a dan u buduænosti je petak.)
 * 
 */

public class prvi {

	public static void main(String[] args) {
		// ispisi poruku korisniku da unese cijeli broj za danasnji dan
		Scanner ulaz = new Scanner(System.in);
		System.out
				.println("Unesite cijeli broj za danasnji dan u sedmici:\n0 za ponedeljak\n1 za utorak\n2 za srijedu\n3 za cetvrtak\n4 za petak\n5 za subotu\n6 za nedelju\n");
		int dan = ulaz.nextInt();
		// ispisi poruku korisniku da unese cijeli dan u buducnosti
		System.out.println("Unesite broj dana nakon danasnjeg dana:");
		int buducnost = ulaz.nextInt();
		// kreiraj niz u kojem su elementi dani u sedmici
		String[] dani = { "Ponedeljak", "Utorak", "Srijeda", "Cetvrtak",
				"Petak", "Subota", "Nedjelja" };
		// kreiraj varijablu za rezultat
		int rez = 0;
		// izracunaj dane u sedmici
		rez = dan + buducnost;
		// ako je rezultat manji od 7 ispisi slijedecu poruku
		if (rez < 7) {
			System.out.println("Danas je " + dani[dan]
					+ " a dan u buducnosti je: " + dani[rez]);

		}
		// ako rezultat nije manji od 7 izvrsi tijelo else petlje
		else {
			// moduo rezultata ce biti dan u buducnosti
			int rez2 = rez % 7;
			// ispisi rezultat
			System.out.println("Danas je " + dani[dan]
					+ " a dan u buducnosti je: " + dani[rez2]);

		}

	}

}
