package zadaci_21_01_2016;

/*
 * Pozitivni cijeli broj je savršen broj ukoliko je jednak zbiru svih svojih pozitivnih 
 * djelilaca, iskljuèujuæi sebe. Na primjer, 6 je prvi savršeni broj jer 6 = 3 + 2 + 1. 
 * Sljedeæi savršeni broj je 28 jer 28 = 14 + 7 + 4 + 2 + 1. Samo 4 savršena broja postoje u 
 * rasponu od 0 do 10.000. Napišite program koji ispisuje sva 4.
 */

public class cetvrti {

	public static void main(String[] args) {
		// ispisi poruku
		System.out.print("Perfektni brojevu u rasponu od 0 do 10 000 su:\n ");
		// kreiraj petlju za raspon brojeva od 2 do 10 000
		for (int i = 2; i < 10_000; i += 2) {
			int pomocna = 0;
			// kreiraj petlju koja ce za svaki "i" provjeriti djelioce
			for (int j = 1; j < i; j++) {
				// ispitaj da li je "i" djeljivo  sa "j"
				if (i % j == 0)
					// ako jest saberi djelioce
					pomocna += j;
			}
			// ako se "i" jednako zbiru svojih djelilaca ispisi savrsen broj
			if (pomocna == i)
				System.out.println(i);
		}
	}
}