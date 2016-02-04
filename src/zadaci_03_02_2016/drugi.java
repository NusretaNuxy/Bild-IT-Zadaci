package zadaci_03_02_2016;

import java.util.Scanner;

/*
 * (Algebra: multiply two matrices) Write a method to multiply two matrices. The
 * header of the method is:
 * public static double[][] multiplyMatrix(double[][] a, double[][] b)
 * To multiply matrix a by matrix b, the number of columns in a must be the same as
 * the number of rows in b, and the two matrices must have elements of the same or
 * compatible types. Let c be the result of the multiplication. Assume the column size
 * of matrix a is n.
 */

public class drugi {
	// kreiraj metod
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		// kreiraj matricu c
		double[][] c = new double[3][3];
		// izvrsi mnozenje elemenata
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				for (int k = 0; k < c[0].length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		// vrati rezultat
		return c;
	}

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		// Kreiraj matrice a i b i matricu d za rezultat
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];
		double[][] d = new double[3][3];
		// ucitaj matricu a od korisnika
		System.out.println("Unesite elemnte matrice a ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = ulaz.nextDouble();
			}
		}
		// ucitaj matricu b od korisnika
		System.out.println("Unesite elemnte matrice b ");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				b[i][j] = ulaz.nextDouble();
			}
		}
		// dodijeli matrici d rezultat
		d = multiplyMatrix(a, b);
		// ispiis rezultat(matricu d)
		System.out.println("matrica c izgleda: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}

	}

}
