package zadaci_16_01_2016;

import java.util.Scanner;

/*
 * Napisati metodu koja ispisuje n x n matricu korsiteæi sljedeæi header:
 * public static void printMatrix(int n)
 * Svaki element u matrici je ili 0 ili 1, generisan nasumièno. 
 * Napisati test program koji pita korisnika da unese n te ispisuje n x n matricu.
 */

public class cetvrti {

	// kreiraj metodu koja prima jedan argument
	public static void printMatrix(int n) {

		int[][] m = new int[n][n]; // deklariši matricu
		// pomoæu petlji izvrši generisanje elemenata matrice
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = (int) (Math.random() * 2);// generiši nasumièno
													// elemenat matrice
													// vrijednosti 0 ili 1
			}

		}
		// ispis matrice
		System.out.println("Generisana je slijedeæa matrica:");
		// petlje za ispis matrice
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {

				System.out.print(m[i][j] + " ");// ispis elemenata
			}
			System.out.println();// za svaki red predji u novi red :)
		}
	}

	public static void main(String[] args) {
		// izvrši unos velièine matrice
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite dimentije matrice: ");
		int x = ulaz.nextInt();
		// pozovi metodu
		printMatrix(x);

	}

}
