package zadaci_24_01_2016;

import java.util.ArrayList;

/*
 * Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. 
 * Na primjer, brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su takoðer twin 
 * primes. Napisati program koji ispisuje sve twin prime brojeve manje od 10000, 
 * 10 parova po liniji. 
 */

public class drugi {

	public static void main(String[] args) {
		// Kreiraj listu za spremanje prostih brojeva
		ArrayList<Integer> prostiBr = new ArrayList<>();
		// kreiraj brojac za ispis 10 brojeva u jednom redu
		int br = 0;
		// za zadani interval kreiraj for petlju
		for (int i = 1; i <= 10000; i++) {
			// provjeri sa kojim brojevima je "i" djeljivo
			for (int j = 2; j <= i; j++) {
				// ako je "i" djeljivo sa "j" i "i" razlicito od "j" odradi
				// berak
				if (i % j == 0 && i != j) {
					break;
				}
				// ako je "i" jednako "j" dodaj broj u listu
				if (i == j) {
					prostiBr.add(i);
				}
			}

		}
		// kreiaj petlju za prolazak kroz listu
		for (int i = 0; i < prostiBr.size() - 1; i++) {
			// po uslovu zadatka treba ispisati Twin prime brojeve koji se
			// razlikuju za 2
			if (prostiBr.get(i + 1) - prostiBr.get(i) == 2) {
				// ispisi brojeve
				System.out.print(prostiBr.get(i) + " " + prostiBr.get(i + 1)
						+ "  ");
				// povecaj brojac
				br++;
				// ako je brojac jednak 10 predji u novi redi i nuliraj brojac
				if (br == 10) {
					System.out.println();
					br = 0;
				}
			}

		}
	}
}