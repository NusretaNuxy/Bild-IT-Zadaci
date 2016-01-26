package zadaci_25_01_2016;

import java.util.ArrayList;

/*
 * Napisati program koji ispisuje sve proste brojeve od 2 do 1000, ukljuæujuæi i 2 i 1000. 
 * Program treba da ispiše 8 brojeva po liniji te razmak izmeðu brojeva treba da bude 
 * jedan space.
 */

public class drugi {
	public static void main(String[] args) {
		// Kreiraj listu za spremanje prostih brojeva
		ArrayList<Integer> prostiBr = new ArrayList<>();
		// kreiraj brojac za ispis 8 brojeva u jednom redu
		int br = 0;
		// za zadani interval kreiraj for petlju
		for (int i = 2; i <= 10000; i++) {
			// provjeri sa kojim brojevima je "i" djeljivo
			for (int j = 2; j <= i; j++) {
				// ako je "i" djeljivo sa "j" i "i" razlicito od "j" odradi
				// break
				if (i % j == 0 && i != j) {
					break;
				}
				// ako je "i" jednako "j" i "i" razlicito od 2 - dodaj broj u
				// listu
				if (i == j && (i != 2)) {
					prostiBr.add(i);
				}
			}

		}
		// kreiaj petlju za prolazak kroz listu
		for (int i = 0; i < prostiBr.size() - 1; i++) {
			// ispisi brojeve
			System.out.print(prostiBr.get(i) + " ");
			// povecaj brojac
			br++;
			// ako je brojac jednak 8 predji u novi redi i nuliraj brojac
			if (br == 8) {
				System.out.println();
				br = 0;
			}
		}

	}
}
