package zadaci_17_01_2016;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *Napisati metodu koja prima 2 argumenta: poèetni broj i krajnji broj te printa sve proste 
 *brojeve u zadanom rangu.
 *BONUS: metoda može primati i treæi argument, broj brojeva za isprintati po liniji.
 */

public class prvi {
	// kreiraj metodu
	public static void printanje(int a, int b) {

		if (a > b) {// ako je prvi broj veci od drugog zamijeni vrijednosti
			int privremena = 0;
			privremena = a;
			a = b;
			b = privremena;

		}
		// ispisi proste brojeve od a do b
		System.out.println("Prosto brojevi izmedju " + a + " i " + b + " su:");
		for (int i = a; i <= b; i++) {// napravi petlju od broja "a" do broja "b"

			if (prost(i) == 0) {// ispitaj da li je broj prost pomocu metoda
								// "prost"
				continue;
			} else {// ako je broj prost ispisi ga
				System.out.print(i + " ");

			}

		}

	}

	// kreiraj metod "prost"
	public static int prost(int broj) {
		for (int j = 2; j < broj; j++) {// kreiraj petlju za sve brojeve vece od
										// 2 i manje od "broja"
			if ((broj > 2) && (broj % 2 == 0) && (broj % j == 0)) {// ispitaj
																	// uslov
				return 0;

			}
		}
		return 1;// ako nista od navedenog nije tacno vrati 1

	}

	public static void main(String[] args) {

		// izvrši unos brojeva
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite poèetni i krajnji broj: ");
		int x = ulaz.nextInt();
		int y = ulaz.nextInt();
		// pozovi metodu
		printanje(x, y);

	}

}
