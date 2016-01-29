package zadaci_29_01_2016;

/*
 * Napisati program koji sabira sljedeæu seriju 
 * 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 ..... + 95/97 + 97/99.
 * 
 */

public class treci {

	public static void main(String[] args) {
		// kreiraj varijablu za kolicnik
		double kolicnik = 0;
		// kreiraj dva niza
		int[] m = new int[49];
		int[] n = new int[49];
		// prvim elementima niza dodijeli vrijednosti
		m[0] = 1;
		n[0] = 3;
		// pomocu for petlje ostalim elementima niza dodijeli vrijedost
		for (int i = 1; i < 49; i++) {
			m[i] = m[i - 1] + 2;
			n[i] = n[i - 1] + 2;

		}
		// izracunaj kolicnik
		for (int i = 0; i < 49; i++) {
			kolicnik += ((double) m[i]) / n[i];
		}
		// ispisi rezultat
		System.out.println("\nKolicnik je: " + kolicnik);

	}

}
