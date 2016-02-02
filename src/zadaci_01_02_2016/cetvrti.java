package zadaci_01_02_2016;

import java.util.Scanner;

/*
 * Napisati metodu sa sljedeæim headerom: public static String format(int number, int width) 
 * koja vraæa string broja sa prefiksom od jedne ili više nula. Velièina stringa je width 
 * argument. Na primjer, ukoliko pozovemo metodu format(34, 4) metoda vraæa 0034, 
 * ukoliko pozovemo format(34, 5) metoda vraæa 00034. Ukoliko je uneseni broj veæi nego 
 * width argument, metoda vraæa samo string broja. Npr. ukoliko pozovemo format(34, 1) 
 * metoda vraæa 34.
 */

public class cetvrti {
	// kreiraj metodu
	public static String format(int number, int width) {
		// prebaci bro u string
		String temp = Integer.toString(number);
		// string prebaci u niz
		char[] niz = temp.toCharArray();
		// izracunaj duzinu niza
		int duzinaNiz = niz.length;
		// kreiraj pomocni string
		String pom = "";
		// ako je duzina niza vec ili jednaka od prefiksa vrati samo broj
		if (duzinaNiz >= width) {
			return temp;
		} else {
			// u suprotnom dodaj na pomocni string onoliko nula koliko je
			// width-duzinaNiz
			for (int i = 0; i < width - duzinaNiz; i++) {
				pom += "0";
			}
		}
		// vrati sabrane nizove pom i temp
		return pom + temp;

	}

	public static void main(String[] args) {
		// ispisi poruku korisniku i unesi broj
		Scanner ulaz = new Scanner(System.in);
		System.out.print("Unesite broj:");
		int x = ulaz.nextInt();
		// ispisi prouku korisniku i unesi velicinu
		System.out.print("Unesite velicinu stringa:");
		int y = ulaz.nextInt();
		// ispisi rezultat i pozovi metodu
		System.out.println(format(x, y));
	}

}
