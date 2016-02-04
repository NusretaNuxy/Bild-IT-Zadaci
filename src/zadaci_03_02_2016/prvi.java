package zadaci_03_02_2016;

import java.util.Scanner;

/*
 * (Compute the weekly hours for each employee) Suppose the weekly hours for all
 * employees are stored in a two-dimensional array. Each row records an employee’s
 * seven-day work hours with seven columns. For example,the following array stores the work
 * hours for eight employees.Write a program that displays employees and their total hours 
 * in decreasing order of the total hours.
 */

public class prvi {
	// kreiraj metodu za sortiranje uposlenika po radnim satima
	public static void sortiraj(int[][] m) {
		// kreiraj niz za smjestanje suma od redova
		int[] sum = new int[8];
		// kreiraj pomocnu varijablu sum
		int suma = 0;
		// prodji kroz matricu i saberi redove matrice
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 7; j++) {
				suma += m[i][j];
			}
			sum[i] = suma;
			suma = 0;
		}
		// sortiraj niz od sume od najveceg ka najmanjem
		int a = 0;
		for (int j = 0; j < sum.length; j++) {
			for (int i = 0; i < sum.length - 1; i++) {
				if (sum[i] < sum[i + 1]) {
					a = sum[i];
					sum[i] = sum[i + 1];
					sum[i + 1] = a;
				}
			}
		}
		// ispisi rezultat
		System.out.println("Po opadadujem redoslijedu zbirni sati izgledaju:");
		for (int i = 0; i < m.length; i++) {
			System.out.print(sum[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// Kreiraj matricu
		int[][] zaposlenici = new int[8][7];

		// ucitaj matricu od korisnika
		System.out.println("Unesite broj radnih sati za uposlenike: ");
		for (int i = 0; i < 8; i++) {
			System.out.print("Unesite broj radnih sati za " + (i + 1)
					+ " uposlenika:");
			for (int j = 0; j < 7; j++) {
				zaposlenici[i][j] = ulaz.nextInt();
			}
		}
		System.out.println();
		// Ispisi matricu
		System.out.println("Broj sati po uposlenicima izgleda:");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(zaposlenici[i][j] + " ");
			}
			System.out.println();
		}
		// pozovi metodu
		sortiraj(zaposlenici);

	}

}
