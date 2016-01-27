package zadaci_26_01_2016;

import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese 3 cijela broja te mu ispiše ta ista tri 
 * broja u rastuæem redosljedu. Bonus: Napisati metodu koja prima tri cijela broja kao 
 * argumente te vraæa brojeve u rastuæem redosljedu. 
 */

public class cetvrti {

	// kriraj metodu
	public static void displaySortedNumbers(int num1, int num2, int num3) {
		// kreiraj niz u koji cemo smjestiti parametre metode
		int[] n = new int[3];
		// Dodijeli nizu vrijednost parametara
		n[0] = num1;
		n[1] = num2;
		n[2] = num3;
		// kreiraj pomocnu varijablu
		int pom;
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
		int broj1 = ulaz.nextInt();
		int broj2 = ulaz.nextInt();
		int broj3 = ulaz.nextInt();
		// pozovi metodu
		displaySortedNumbers(broj1, broj2, broj3);

	}

}
