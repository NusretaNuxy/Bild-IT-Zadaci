package zadaci_17_01_2016;

import java.util.Scanner;

/*
 *Napisati metodu koja vra�a lokaciju najve�eg elementa u 2D nizu. 
 *Metoda treba da koristi sljede�i header:
 *public static int[ ] locateLargest(double[ ][ ] a)
 *Napisati test program koji pita korisnika da unese 2D niz te mu ispisuje lokaciju 
 *najve�eg elementa u nizu.
 */

public class cetvrti {
	// kreiraj metodu koja prima 2D niza tipa double
	public static int[] locateLargest(double[][] a) {

		double max = 0.0;// deklari�i i inicjalizuj varijablu max
		int[] pomocni = new int[2]; // kreiraj pomocni niz velicine 2 elementa

		for (int i = 0; i < a.length; i++) {// kreiraj petlju za prolazak kroz
											// redove
			for (int j = 0; j < a.length; j++) {// kreiraj petlju za prolazak
												// kroz kolone
				if (a[i][j] > max) {// ispitaj uslov- da li je matrica na "i j"
									// mjestu veca od makimalne varijable
					max = a[i][j]; // ako jest - makimalna vrijednost poprima
									// vrijednost matrice na [i] [j] mjestu
					pomocni[0] = i;// prvi elemenat pomocnog niza prima
									// vrijednost reda
					pomocni[1] = j;// drugi elemenat pomocnog niza prima
									// vrijednost kolone
				}
			}
		}
		return pomocni;// vrati pomocni niz

	}

	public static void main(String[] args) {
		// izvr�i unos velicine 2D niza
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite velici�inu 2D niza:");
		int n1 = ulaz.nextInt();
		int n2 = ulaz.nextInt();
		// deklari�i 2D niz
		double[][] niz = new double[n1][n2];
		// unesite elemente niza
		System.out.println("Unesite elemnte niza:");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {
				niz[i][j] = ulaz.nextDouble();
			}
		}
		// dodijeli nizu "rezultat" rezultat metode LocateLargest
		int[] rezultat = locateLargest(niz);
		// ispisi rezultat
		System.out.println("Najveci elemenat niza nalazi se na indexu: "
				+ rezultat[0] + "." + rezultat[1]);

	}

}
