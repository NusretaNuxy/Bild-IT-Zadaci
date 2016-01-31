package zadaci_30_01_2016;

import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese cijeli broj te ispisuje piramidu svih 
 * brojeva do tog broja. (Na primjer, ukoliko korisnik unese 7 vrh piramide je broj 1, 
 * red ispod vrha piramide je 2 1 2, red ispod je 3 2 1 2 3, red ispod 4 3 2 1 2 3 4 itd.)
 */
public class peti {

	public static void main(String[] args) {
		// ispisi poruku korisniku
		System.out.println("Unesite broj: ");
		Scanner ulaz = new Scanner(System.in);
		// izvrsi unos broja
		int broj = ulaz.nextInt();
		// kreiraj petlju za broj redova
		for (int i = 1; i <= broj; i++) {
			// kreiraj petlju za prazna mjesta
			for (int j = broj; j > i; j--) {
				System.out.print(" ");
			}
			// Petlja printa potrebne brojeve s lijeva
			for (int j = i; j > 1; j--) {
				System.out.print(j);
			}
			// Petlja printa potrebne brojeve od sredine ka desno
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}

			// Poslije ispisa predji u novi red
			System.out.println();
		}
	}

}
