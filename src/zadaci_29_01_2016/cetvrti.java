package zadaci_29_01_2016;

/*
 *  Napisati metodu koja izraèunava zbir svih brojeva u cijelom broju. 
 *  Koristite sljedeæi header: public static int sumDigits(long n). 
 *  Na primjer, ako pozovemo metodu i proslijedimo joj broj 234 (sumDigits(234)) 
 *  metoda treba da vrati 9. (2 + 3 + 4 = 9)
 */
import java.util.Scanner;

public class cetvrti {
	// kreiraj metodu za rastavljanje broja

	public static int sumDigits(long n) {
		// kreiram varijablu za sumu
		int sum = 0;
		// sve dok je broj razlicit od 0 rastavljaj ga na cifre
		while (n != 0) {
			int mod;
			mod = (int) (n % 10);
			sum = sum + mod;
			n /= 10;

		}
		// vrati rezultat
		return sum;

	}

	public static void main(String[] args) {
		// ispisi poruku o unosu cijelog broja
		System.out.println("Unesite jedan cijeli broj:");
		Scanner ulaz = new Scanner(System.in);
		int broj = ulaz.nextInt();
		// ispisi rezultat i pozovi metodu
		System.out.println("Suma svih cifara broja " + broj + " je "
				+ sumDigits(broj));

	}

}
