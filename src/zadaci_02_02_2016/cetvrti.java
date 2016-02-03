package zadaci_02_02_2016;

import java.util.Scanner;

import java.util.Scanner;

/*
 * 
 * (Sum elements column by column) Write a method that returns the sum of all the 
 * elements in a specified column in a matrix using the following header:
 * public static double sumColumn(double[][] m, int columnIndex)
 * 
 */

public class cetvrti {
	// kreiraj metodu
	public static double sumColumn(double[][] m, int columnIndex) {
		// kreirj varijablu za sumu
		double suma = 0;
		// saberi elemnte po izabranoj koloni
		for (int a = 0; a < m.length; a++) {
			suma += m[a][columnIndex];
		}
		// vrati vrijednost sume
		return suma;
	}

	public static void main(String[] args) {

		// Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);

		// Pitaj korisnika da unese broj redova
		System.out.println("Molimo unesite broj redova: ");
		int r = unos.nextInt();

		// Pitaj korisnika da unese broj kolona
		System.out.println("Molimo unesite broj kolona: ");
		int k = unos.nextInt();

		// Kreiraj i ucitaj matricu od korisnika
		System.out.println("Unesite clanove matrice: ");
		double[][] matrica = new double[r][k];
		for (int a = 0; a < matrica.length; a++) {
			for (int b = 0; b < matrica[a].length; b++) {
				matrica[a][b] = unos.nextDouble();
			}
		}

		// Ispisi matricu
		for (int a = 0; a < matrica.length; a++) {
			for (int b = 0; b < matrica[a].length; b++) {
				System.out.print(matrica[a][b]+ " ");
			}
			System.out.println();
		}
		// Izaberi broj kolone i ispisi rezultat
		System.out.println("Izaberite broj kolone od 1 do "
				+ matrica[0].length);
		int c = unos.nextInt();
		c = c - 1;
		System.out.println("Suma izabrane kolone je: " + sumColumn(matrica, c));

	}

}
