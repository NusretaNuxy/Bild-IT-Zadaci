package zadaci_26_01_2016;

/*
 * Napisati metodu sa sljedeæim headerom: public static int isPrime(int n) koja 
 * provjerava da li je broj prost/prime. Napsati test program koji poziva ovu metodu i 
 * ispisuje sve proste brojeve u rasponu od 0 do 100000.
 */

public class treci {
	// kreiraj metodu
	public static int isPrime(int n) {
		// kreiraj pomocnu varijablu
		int pomocna = 0;
		// kreiraj petlju od 2 do vrijednosti n
		for (int j = 2; j <= n; j++) {
			// ako je "n" djeljivo sa "j" i "n" razlicito od "j" odradi break
			if (n % j == 0 && n != j) {
				break;
			}
			// ako je "n" jednako "j" i "n" razlicito od 2 pomocnoj varijabli
			// dodijeli vrijednost n
			if (n == j && (n != 2)) {
				pomocna = n;
			}
		}
		// vrati rezultat
		return pomocna;

	}

	public static void main(String[] args) {
		// kreiraj brojac za ispis 10 brojeva u jednom redu
		int br = 0;
		// za zadani interval(od 0 do 10000) kreiraj for petlju
		for (int i = 0; i <= 10000; i++) {
			// ako je rezultat razlicit od nule ispisi broj
			if (isPrime(i) != 0) {
				System.out.print(isPrime(i) + " ");
				// povecaj brojac za ispis
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