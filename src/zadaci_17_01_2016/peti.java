package zadaci_17_01_2016;

import java.util.Scanner;

/*
 *Implementirati sljedeæu metodu da sortira redove u 2D nizu.
 *public static double[ ][ ] sortRows(double[ ][ ] array)
 *Napisati testni program koji pita korisnika da unese 3x3 matricu 
 *(ili da pita korisnika koliku matricu želi unijeti) te mu ispisuje na konzoli matricu sa
 sortiranim redovima - od najmanjeg broja do najveæeg.
 */

public class peti {
	// kreiraj metodu

	public static double[][] sortRows(double[][] array) {
		double pom;// kreiraj pomocnu varijablu
		for (int k = 0; k < array.length - 1; k++) {// kreiraj petlju-za
													// prolazak vise puta kroz
													// red
			for (int i = 0; i < array.length; i++) {// kreiraj petlju za
													// prolazak kroz red
				for (int j = 0; j < array.length - 1; j++) {// kreiraj petlju za
															// prolazak kroz
															// kolonu
					if (array[i][j] > array[i][j + 1]) {// ako je vrijednost
														// veca od slijedeceg
														// elemnta u redu
						pom = array[i][j];// pomocnoj varijabli dodijeli [i][j]
											// vrijednost
						array[i][j] = array[i][j + 1];// u redu na mjestu [i][j]
														// dodijeli vrijednost
														// sa mjesta [i][j + 1]
						array[i][j + 1] = pom;// na mjestu [i][j + 1] dodijeli
												// vrijednost pomocne varijable
					}
				}

			}
		}
		return array; // vrati niz
	}

	public static void main(String[] args) {
		// izvrši unos velicine 2D niza
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite velicièinu 2D niza:");
		int n1 = ulaz.nextInt();
		int n2 = ulaz.nextInt();
		// deklariši niz
		double[][] niz = new double[n1][n2];
		// unsi elemente niza
		System.out.println("Unesite elemnte niza:");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {
				niz[i][j] = ulaz.nextDouble();
			}
		}
		// ispiši unijete elemente niza
		System.out.println("Unijeli ste slijedeæu matricu:");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {
				System.out.print(niz[i][j] + " ");

			}
			System.out.println();
		}

		// ispisi sortirane elemente u nizu
		System.out.println("\nSortirani niz izgleda: ");

		niz = sortRows(niz);// pozovi metodu
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length; j++) {
				System.out.print(niz[i][j] + " ");

			}
			System.out.println();
		}

	}
}
