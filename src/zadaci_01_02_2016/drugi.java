package zadaci_01_02_2016;

import java.util.Scanner;
/*
 *  Napisati program koji prima karakter te vra�a njegov Unicode. Primjer: 
 *  ukoliko korisnik unese karakter E program mu vra�a 69 kao unicode za taj karakter.
 */

import java.util.Scanner;

public class drugi {

	public static void main(String[] args) {
		// unesite karakter
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite  karakter:");
		char a = ulaz.next().charAt(0);
		// ispisi decimalnu vrijednost u ascii kodu za uneseni karakter
		System.out.println("Za karakter " + a + " Unikod je " + (int) a);

	}

}