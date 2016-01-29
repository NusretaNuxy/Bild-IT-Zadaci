package zadaci_29_01_2016;

import java.util.Scanner;

/*
 * Napisati metodu koja ispisuje n x n matricu koristeæi se sljedeæim headerom: 
 * public static void printMatrix(int n). 
 * Svaki element u matrici je ili 0 ili 1, nasumièno generisana. 
 * Napisati test program koji pita korisnika da unese broj n te mu ispiše n x n 
 * matricu u konzoli. 
 */
public class peti {
	// kreiraj metodu za ispis matrice
	public static void printMatrix(int n) {
		// kreiraj matericu velicine nxn
		int[][] mat = new int[n][n];
		// ispisi poruku
		System.out.println("Generisana matrica je:");
		// generisi elemente matrice 0 ili 1
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				int slBr = (int) (Math.random() * 2);
				// dodijeli genrisanu vrijednost elementu ij
				mat[i][j] = slBr;
			}
		}
		// izvrsi ispis matrice
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j] + " ");

			}
			// predji u novi red
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// unesite velicinu matrice
		System.out.println("Unesite velicinu matrice");
		Scanner ulaz = new Scanner(System.in);
		int n = ulaz.nextInt();
		// pozovi metodu
		printMatrix(n);

	}

}
