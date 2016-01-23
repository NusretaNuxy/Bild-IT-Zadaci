package zadaci_22_01_2016;

/*
 * Napišite program koji ispisuje sve brojeve, od 100 do 1000, 10 brojeva po liniji, 
 * koji su djeljivi i sa 5 i sa 6. Razmak izmeðu brojeva treba biti taèno jedan space.
 */

public class treci {

	public static void main(String[] args) {
		int br = 0;
		System.out
				.println("Svi brojevi u intervalu od 100 do 1000 djeljivi i sa 5 i sa 6 su:\n");
		for (int i = 100; i < 1000; i++) {
			if ((i % 5 == 0) && (i % 6 == 0)) {
				System.out.print(i + " ");
				br++;
				if (br == 10) {
					System.out.println();
					br = 0;
				}
			}
		}

	}

}
