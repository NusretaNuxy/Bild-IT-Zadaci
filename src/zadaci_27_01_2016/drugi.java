package zadaci_27_01_2016;

import java.util.Scanner;

/*
 * Napišite metodu sa sljedeæim headerom koja vraæa naopako ispisan broj koji joj je 
 * proslijeðen kao argument: public static void reverse(int number). Na primjer, 
 * reverse(3456) treba da vrati 6543. Napisati program koji pita korisnika da unese 
 * neki cijeli broj te mu vrati isti ispisan naopako
 */

public class drugi {
	// kreiraj metodu koja prima kao parametar int broj

	public static void reverse(int number) {
		// kreiraj varijablu za sumu
		int sum = 0;
		// kreiraj petlju koja krece od broja pa sve do 0
		for (int i = number; i > 0; i /= 10) {
			int mod;
			// racunaj moduo od i
			mod = i % 10;
			// sumi dodaj vrijednost sume pomnozenu sa 10 plus moduo
			sum = sum * 10 + mod;

		}
		// ispisi rezultat
		System.out.println("Cijeli broj ispisan naopako: " + sum);
	}

	public static void main(String[] args) {
		// izvrsi unos broja
		System.out.println("Unesite jedan cijeli broj:");
		Scanner ulaz = new Scanner(System.in);
		int broj = ulaz.nextInt();
		// pozovi metodu
		reverse(broj);

	}

}
