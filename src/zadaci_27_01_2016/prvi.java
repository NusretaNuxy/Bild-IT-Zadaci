package zadaci_27_01_2016;

import java.util.Scanner;

/*
 * (Izra�unavanje napojnice) Napisati program koji u�itava ukupan iznos ra�una koji treba 
 * uplatiti kao i procenat tog ra�una kojeg �elimo platiti kao napojnicu te izra�unava 
 * ukupan ra�un i napojnicu. Na primjer, ukoliko korisnik unese 10 kao ra�un i 15 % kao 
 * procenat za napojnicu program treba da ispi�e da je ukupan ra�un za uplatiti 11.5 a 
 * napojnica 1.5. 
 */

import java.util.Scanner;

public class prvi {

	public static void main(String[] args) {
		// varijable za napojnicu i iznos racuna
		double platiti;
		double napojnica;

		Scanner ulaz = new Scanner(System.in);
		// izvrsi unos iznosa racuna od korisnika
		System.out.println("Unesite iznos ra�una ");
		int racun = ulaz.nextInt();
		// izvrsite unos napojnice
		System.out.println("Unesite iznos napojnice");
		int nap = ulaz.nextInt();
		// izracunaj napojnicu
		napojnica = (double) (racun * nap) / 100;
		// Izracunaj ukupan racun
		platiti = (double) racun + napojnica;
		// ispisi rezultat
		System.out.println("Vrijednost ra�una koji trebate platiti je "
				+ platiti + "\nUkupna vrijednost napojnice je " + napojnica);

	}

}
