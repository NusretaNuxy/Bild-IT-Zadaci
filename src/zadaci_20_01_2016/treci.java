package zadaci_20_01_2016;

import java.util.Scanner;

/*
 * 
 *  Napisati metode sa sljedeæim headerima: public static int reverse(int number) i 
 *  public static boolean isPalindrome(int number). 
 *  Prva metoda prima cijeli broj kao argument i vraæa isti ispisan naopako. 
 *  (npr. reverse(456) vraæa 654.) 
 *  Druga metoda vraæa true ukoliko je broj palindrom a false ukoliko nije. 
 *  Koristite reverse metodu da implementirate isPalindrome metodu. 
 *  Napišite program koji pita korisnika da unese broj te mu vrati da li je broj 
 *  palindrome ili ne. 
 */

public class treci {
	// kreiraj metodu
	public static int reverse(int number) {

		int pomocna = 0;// definisemo pomocnu varijablu
		int rez = 0;// definisemo varijablu za return

		do {
			// uzimamo moduo broja
			pomocna = number % 10;
			// dodajemo rezultatu cifre
			rez = rez * 10 + pomocna;
			// dijelimo broj dok ne postane 0
			number /= 10;
		} while (number != 0);
		return rez;// vrati rezultat

	}

	// kreiraj drugu metodu
	public static boolean isPalindrome(int number) {
		// pretvorimo int u string
		String temp = Integer.toString(number);
		// kreirajmo varijablu za prolazak od pocetka kroz sting
		int poc = 0;
		// kreirajmo varijablu za prolazak od kraja kroz sting
		int kraj = temp.length() - 1;

		// vrti while petlju sve dok je uslov tacan
		while (temp.charAt(poc) == temp.charAt(kraj) && (poc < kraj)) {
			poc++;// inkrementiraj brojac
			kraj--;// inkrementiraj brojac

		}
		// ako je poc manji od kraja vrati false
		if (poc < kraj) {
			return false;
			// u suprotnom vrati true
		} else {
			return true;
		}

	}

	public static void main(String[] args) {
		// unesi broj
		System.out.println("Unesite broj: ");
		Scanner ulaz = new Scanner(System.in);
		int broj = ulaz.nextInt();
		// ispisi rezultat
		System.out.println("Broj ispisan naopako je: " + reverse(broj));
		// ako metoda vrati true ispisi sledece
		if (isPalindrome(broj) == true) {
			System.out.println("Broj JE palindrom ");
		}
		// ako metoda vrati false ispisi sledece
		if (isPalindrome(broj) == false) {
			System.out.println("Broj NIJE palindrom ");
		}

	}

}
