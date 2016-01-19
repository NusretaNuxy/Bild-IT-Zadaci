package zadaci_18_01_2016;

import java.util.Scanner;

/*
 * 
 * ISBN-10 (International Standard Book Number) se sadrži od 10 brojeva: 
 * d1 d2 d3 d4 d5 d6 *  d7 d8 d9 d10. Posljednji broj, d10, služi kao checksum i njega 
 * izraèunavamo iz prvih devet brojeva koristeæi se sljedeæom formulom: 
 * (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11. 
 * Ukoliko je checksum 10, zadnji broj oznaèavamo sa X u skladu sa ISBN-10 konvencijom. 
 * Napisati program koji pita korisnika da unese prvih 9 brojeva te ispiše desetocifreni 
 * ISBN-10 broj. 
 * (Primjer: ukoliko unesemo, kao prvih 9 brojeva, 013601267 program nam ispisuje 
 * 0136012671 kao ISBN-10 broj. Ukoliko unesemo 013031997 kao prvih 9 brojeva, 
 * program nam ispisuje 013031997X kao ISBN-10 broj)
 */

public class drugi {

	public static void main(String[] args) {
		// kreiraj niz
		int[] n = new int[9];
		// Unesite 9 cifara od korisnika
		System.out.println("Unesite prvih 9 brojeva:");
		Scanner ulaz = new Scanner(System.in);
		for (int i = 0; i < n.length; i++) {
			n[i] = ulaz.nextInt();// smjestiti unesene cifre u niz
		}
		// izracunaj checksum
		int checksum = (int) (n[0] * 1 + n[1] * 2 + n[2] * 3 + n[3] * 4 + n[4]
				* 5 + n[5] * 6 + n[6] * 7 + n[7] * 8 + n[8] * 9) % 11;

		// Ispisi vrijednost
		System.out.println("ISBN broj:");
		// ispisi prvo sve unesene brojeve
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]);
		}
		// Zatim ispisi vrijednost checksum-a
		if (checksum == 10) {// ako je vrijednost jednaka 10 ispisi X
			System.out.print("X");
		} else
			// ako nije ispisi checksum
			System.out.print(checksum);
	}

}
