package zadaci_02_02_2016;

import java.util.Scanner;

/*
 * (Pattern recognition: consecutive four equal numbers) Write the following
 * method that tests whether the array has four consecutive numbers with the same
 * value.
 * public static boolean isConsecutiveFour(int[] values)
 * Write a test program that prompts the user to enter a series of integers and displays
 * if the series contains four consecutive numbers with the same value. Your
 * program should first prompt the user to enter the input size—i.e., the number of
 * values in the series. Here are sample runs:
 */

public class treci {
	// kreiraj metodu
	public static boolean isConsecutiveFour(int[] values) {
		// postavi brojac na nulu
		int br = 0;
		// kreiraj petlju za prolazak kroz niz
		for (int i = 0; i < values.length - 3; i++) {
			// ukoliko je prvi element jednak drugom,trecem i cetvrtom - povecaj
			// brojac za 1
			if (values[i] == values[i + 1] && values[i] == values[i + 2]
					&& values[i] == values[i + 3]) {
				br++;
			}
		}
		// ukoliko je vrijednost brojaca razlicita od 0 - niz sadrzi 4 ista
		// uzaspopna elementa i vrati true
		if (br != 0) {
			return true;
		}
		// u suprotnom vrati false
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// ispisi prouku za unos velicine niza
		System.out.println("Unesite velicinu niza:");
		int vel = ulaz.nextInt();
		// kreiraj niz
		int[] n = new int[vel];
		// ispisi poruku i unesi elemnete niza
		System.out.println("Unesite elemente niza:");
		for (int i = 0; i < vel; i++) {
			n[i] = ulaz.nextInt();
		}
		// ukoliko je metoda vratila true ispisi slijedecu poruku
		if (isConsecutiveFour(n) == true) {
			System.out.println("Niz ima 4 uzastopna elementa!");
		}// ukoliko je metoda vratila false ispisi slijedecu poruku
		else {
			System.out.println("Niz nema 4 uzastopna elementa!");
		}

	}

}
