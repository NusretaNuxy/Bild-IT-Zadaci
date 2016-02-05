package zadaci_04_02_2016;

import java.util.Scanner;

/*
 * (Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
 * identical if their corresponding elements are equal. Write a method that returns 
 * true if m1 and m2 are strictly identical, using the following header:
 * public static boolean equals(int[][] m1, int[][] m2)
 * Write a test program that prompts the user to enter two 3 * 3 arrays of
 * integers and displays whether the two are strictly identical. Here are the sample runs.
 */

public class drugi {
	// kreiraj metdou za ispitivanje da li su matrice jednake
	public static boolean equals(int[][] m1, int[][] m2) {
		// kreiraj petlje za prolazak kroz red
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1.length; j++) {
				// ukoliko se jedan ili vise elemenata razlikuje vrati false
				if (m1[i][j] != m2[i][j]) {
					return false;
				}
			}

		}
		// u suprtnom vrati true
		return true;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// ispisi poruku za unos velicine matrice
		System.out.println("unesite velicinu matrice: ");
		int vel = ulaz.nextInt();
		// kreiraj dvije matrice
		int[][] a = new int[vel][vel];
		int[][] b = new int[vel][vel];
		// ispisi poruku za unos prve matrice
		System.out.println("Unesite elemnte matrice a ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = ulaz.nextInt();
			}
		}
		// ucitaj matricu b od korisnika
		System.out.println("Unesite elemnte matrice b ");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				b[i][j] = ulaz.nextInt();
			}
		}
		// ispitaj uslove i ispisi rezultat
		if (equals(a, b) == true) {
			System.out.println("Matrice su jednake! ");
		} else {
			System.out.println("matrice nisu jednake!");

		}
	}
}
