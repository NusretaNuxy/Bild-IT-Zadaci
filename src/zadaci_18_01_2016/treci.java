package zadaci_18_01_2016;

import java.util.Scanner;

/*
 * 
 * Napisati metodu sa sljedeæim headerom koja ispisuje tri broja u rastuæem redosljedu: 
 * public static void displaySortedNumbers(double num1, double num2, double num3). 
 * Napisati program koji pita korisnika da unese tri broja te ispiše ta tri broja u 
 * rastuæem redosljedu. 
 */

public class treci {
	// kriraj metodu
	public static void displaySortedNumbers(double num1, double num2,
			double num3) {
		double[] n = new double[3];// kreiraj niz u koji cemo smjestiti
									// parametre metode
		// Dodijeli nizu vrijednost parametara
		n[0] = num1;
		n[1] = num2;
		n[2] = num3;
		double pom;// kreiraj pomocnu varijablu
		// Sortiraj niz u rastucem redoslijedu
		for (int j = 0; j < n.length - 1; j++) {
			for (int i = 0; i < n.length - 1; i++) {
				if (n[i] > n[i + 1]) {
					pom = n[i];
					n[i] = n[i + 1];
					n[i + 1] = pom;
				}
			}
		}
		// ispisi sortirane elemente niza
		System.out.println("Brojevi u rastucem redoslijedu:");
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}

	}

	public static void main(String[] args) {
		// Unesite brojeve od korisnika
		System.out.println("Unesite tri cijela broja:");
		Scanner ulaz = new Scanner(System.in);
		double broj1 = ulaz.nextDouble();
		double broj2 = ulaz.nextDouble();
		double broj3 = ulaz.nextDouble();
		// pozovi metodu
		displaySortedNumbers(broj1, broj2, broj3);

	}

}
