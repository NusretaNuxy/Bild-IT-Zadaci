package zadaci_18_01_2016;

import java.util.Scanner;

/*
 * 
 * Napisati program koji pita korisnika da unese neki cijeli broj te ispisuje njegove 
 * najmanje faktore u rastuæem redosljedu. 
 * Na primjer, ukoliko korisnik unese 120 program treba da ispiše 2, 2, 2, 3, 5. 
 * (2 * 2 * 2 * 3 * 5 = 120) 
 */

public class prvi {

	public static void main(String[] args) {
		// Unesite cijeli broj od korisnika
		System.out.println("Unesite cijeli broj:");
		Scanner ulaz = new Scanner(System.in);
		int broj = ulaz.nextInt();

		int djelilac = 2;// Inicijalizuj djelilac na vrijednost 2
		// Ispisi poruku
		System.out.println("najmanji faktori unesenog broja su:");
		while (broj > 1) {// sve dok je broj veci od 1 vrti petlju
			if (broj % djelilac == 0) {// Prvo ispitaj da li je broj djeljiv sa
										// 2
				broj = broj / djelilac;// ako jest podijeli broj sa 2
				System.out.println(djelilac);// printaj djelilac
			} else {
				djelilac++; // ako broj nije djeljiv sa 2 povecaj djelilac
				if (broj % djelilac == 0) {// Ispitaj da li je broj djeljiv sa
											// inkrementtiranim djeliocem
					broj = broj / djelilac;// podijeli broj sa djeliocem
					System.out.println(djelilac);// printaj djelilac
				}
			}
		}

	}
}
