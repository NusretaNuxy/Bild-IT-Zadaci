package zadaci_02_02_2016;
import java.util.Scanner;
/*
 * (Algebra: add two matrices) Write a method to add two matrices. The header of
 * the method is as follows:
 * public static double[][] addMatrix(double[][] a, double[][] b) 
 * In order to be added, the two matrices must have the same dimensions and the
 * same or compatible types of elements.
 */

/*
 * 
 * @author Nusreta Badzic
 * 
 *
 *Napisati metodu koja sabira 2D niza koja korisnik unese. 
 *Metoda treba da koristi sljedeæi header: 
 *public static double[ ][ ] addMatrix(double[ ][ ] a, double[ ][ ] b)
 *Da bi dvije matrice bile sabrane, moraju biti istih dimenzija i istog 
 *ili kompatibilnog tipa elemenata. Rezultat sabiranja matrica pohraniti u 
 *treæu matricu, matricu c, i ispisati korisniku rezultat.
 * 
 */

public class peti {
	// Kreiraj metod public static double[ ][ ] addMatrix(double[ ][ ] a,
	// double[ ][ ] b)

	public static double[][] addMatrix(double[][] a, double[][] b) {
		// deklariši treæu matricu
		double c[][] = new double[3][3];
		// deklariši i inicijaliziraj zbir
		double zbir = 0;
		// Smjesti zbir elemenata u treæu matricu
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				zbir = a[i][j] + b[i][j];
				c[i][j] = zbir;
				zbir = 0;

			}
		}
		// vrati rezultat

		return c;
	}

	public static void main(String[] args) {
		// Kreiraj matrice

		double[][] matrica1 = new double[3][3];
		double[][] matrica2 = new double[3][3];

		Scanner ulaz = new Scanner(System.in);
		// Izvrši unos elemenata prve matrice
		System.out.println("Unesite elemente prve matrice: ");
		for (int i = 0; i < matrica1.length; i++) {
			for (int j = 0; j < matrica1[i].length; j++) {
				matrica1[i][j] = ulaz.nextDouble();
			}
		}

		// Izvrši unos elemenata druge matrice
		System.out.println("Unesite elemente druge matrice: ");
		for (int i = 0; i < matrica2.length; i++) {
			for (int j = 0; j < matrica2[i].length; j++) {
				matrica2[i][j] = ulaz.nextDouble();
			}
		}
		// Ispiši rezultat
		System.out.println("Nakon sabiranja elemenata treæa matrica izgleda:");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(addMatrix(matrica1, matrica2)[i][j] + " ");
			}
			System.out.println();

		}

	}
}
