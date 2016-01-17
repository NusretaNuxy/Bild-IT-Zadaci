package zadaci_16_01_2016;

import java.util.Scanner;

/*
 * Napisati metodu koja ispisuje n x n matricu korsite�i sljede�i header:
 * public static void printMatrix(int n)
 * Svaki element u matrici je ili 0 ili 1, generisan nasumi�no. 
 * Napisati test program koji pita korisnika da unese n te ispisuje n x n matricu.
 */

public class cetvrti {

	// kreiraj metodu koja prima jedan argument
	public static void printMatrix(int n) {

		int[][] m = new int[n][n]; // deklari�i matricu
		// pomo�u petlji izvr�i generisanje elemenata matrice
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = (int) (Math.random() * 2);// generi�i nasumi�no
													// elemenat matrice
													// vrijednosti 0 ili 1
			}

		}
		// ispis matrice
		System.out.println("Generisana je slijede�a matrica:");
		// petlje za ispis matrice
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {

				System.out.print(m[i][j] + " ");// ispis elemenata
			}
			System.out.println();// za svaki red predji u novi red :)
		}
	}

	public static void main(String[] args) {
		// izvr�i unos veli�ine matrice
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite dimentije matrice: ");
		int x = ulaz.nextInt();
		// pozovi metodu
		printMatrix(x);

	}

}
