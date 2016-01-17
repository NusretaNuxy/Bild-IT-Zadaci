package zadaci_16_01_2016;

/*
 * 
 * Napisati program koji ispisuje sve prestupne godine, 10 po liniji, 
 * od godine 101 do 2100, odvojene jednim spaceom. Takoðer ispisati i ukupan broj 
 * prijestupnih godina u ovom vremenskom periodu.
 */

public class prvi {

	// kreiraj metodu za racunanje prijestupnih godina
	public static void prijestupna(int a, int b) {// metoda prima dva argumenta
		int br = 0; // deklarisimo brojac koji cemo koristiti za prelazak u novi
					// red

		// napravimo petlju za trazeni perido
		for (int i = a; i <= b; i++) {
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {// uslov za
																	// racunanje
																	// prijestupne
																	// godine

				System.out.print(i + " "); // vrsimo ispis prijestupnih godina

				br++; // ako je godina prijestupna brojac povecaj za 1
			}
			if (br == 10) {// ako je brojac jednak 10 izvrsi slijedeci kod
				System.out.println();// prelazak u novi red
				br = 0; // Nuliraj brojac
			}
		}
	}

	public static void main(String[] args) {
		// ispisi poruku
		
		System.out
				.println("Od 101 do 2100-te godine,prijestupne su slijedeæe godine: ");
		prijestupna(101, 2100); // pozivanje metode za trazeni period

		System.out.println("\nPrijestupne godine u ovom periodu su: ");
		prijestupna(2016, 2050); // pozivanje metode za proizvoljni period

	}

}
