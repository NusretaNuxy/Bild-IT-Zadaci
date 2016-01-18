package zadaci_17_01_2016;

import java.util.Scanner;

/*
 *Nizovi niz1 i niz2 su striktno identièni ukoliko su svi njihovi elementi na istim pozicijama jednaki. 
 *Napisati metodu koja vraæa true ukoliko su nizovi niz1 i niz2 striktno identièni. 
 *Koristiti sljedeæi header:
 *public static boolean equals(int[ ] niz1, int[ ] niz2)
 */

public class treci {

	public static boolean equals(int[] niz1, int[] niz2) {
		// prvo ispitaj da li su velicine nizova iste
		if (niz1.length != niz2.length) {
			return false;// ako nisu odmah vrati false
		} else {// ako jesu nastavi dalje sa ispitivanjem

			for (int i = 0; i < niz1.length; i++) {// kreiraj petlu za prolazak
													// korz nizove
				if (niz1[i] != niz2[i]) {// ako je niz1 na i-tom mjestu razlicit
											// od niza2 na i-tom mjestu
					return false; // vrati false
				}

			}

		}
		return true;// vrati true

	}

	public static void main(String[] args) {
		// Izvrsi unos velicine nizova
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite velicièinu nizova:");
		int m1 = ulaz.nextInt();
		int m2 = ulaz.nextInt();
		// deklarisi nizove
		int[] n1 = new int[m1];
		int[] n2 = new int[m2];
		// izvrsi unos elemenata prvog niza
		System.out.println("Unesite elemnte prvog niza:");
		for (int i = 0; i < n1.length; i++) {
			n1[i] = ulaz.nextInt();
		}
		// Izvrisi unos elemenata durgog niza
		System.out.println("Unesite elemnte drugog niza:");
		for (int i = 0; i < n2.length; i++) {
			n2[i] = ulaz.nextInt();
		}
		// ispitaj da li je metod vratio true
		if (equals(n1, n2) == true) {
			System.out.println("Nizovi su jednaki!");// ako jest ispisi rezultat
		}
		if (equals(n1, n2) == false) {// ako je metod vratio false
			System.out.println("Nizovi nisu jednaki!");// ispisi rezultat
		}

	}

}
