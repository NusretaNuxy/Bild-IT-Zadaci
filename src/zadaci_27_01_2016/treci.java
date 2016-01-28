package zadaci_27_01_2016;

/*
 * Emirp brojevi (prime unazad) je nepalindromski prosti broj koji je prosti broj i 
 * kada ispišemo naopako. Na primjer, broj 17 i broj 71 su prosti brojevi tako da su 
 * brojevi i 17 i 71 emirp brojevi. 
 * Napisati program koji ispisuje prvih 100 emirp brojeva, 10 brojeva po liniji. 
 */

public class treci {
	// kreiraj metodu za ispitivanje da li je broj prost

	public static boolean isPrime(int n) {
		// kreiraj petlju od 2 do vrijednosti n
		for (int j = 2; j <= n; j++) {
			// ako je "n" djeljivo sa "j" i "n" razlicito od "j" vrati false
			if (n % j == 0 && n != j) {
				return false;
			}
			// ako je "n" jednako "j" i "n" razlicito od 2 vrati true
			if (n == j && (n != 2)) {
				return true;
			}
		}
		// vrati rezultat
		return false;

	}

	// kreiraj metodu za vracanje broja unazad
	public static int reverse(int number) {
		// kreiraj varijblu num
		int num = 0;
		// sve dok je number razlicit od 0 dijeli broj
		while (number != 0) {
			num = num * 10;
			num = num + number % 10;
			number /= 10;
		}
		// vrati rezultat
		return num;
	}

	// kreiraj metodu za ispitivanje da li je broj napisan naopako i prost broj

	public static boolean isEmirp(int number) {
		// pomocu prethodno kreiranih metoda ispitaj ispitaj uslov
		if ((isPrime(number)) && (isPrime(reverse(number)))) {
			// ako jest vrati true
			return true;
		}
		// ako nije vraca false
		return false;
	}

	public static void main(String[] args) {
		// kreiraj brojac za redove
		int brL = 0;
		// kreiraj brojac za ispis prvih 100 brojeva
		int br = 0;
		// ispis prvih 100 emirp brojeva 10 po liniji
		for (int i = 10; i < 10000; i++) {
			// pozivanje metode za ispitivanje emirp broja
			if (isEmirp(i)) {
				System.out.print(i + " ");
				brL++;
				br++;
				if (brL == 10) {
					System.out.println();
					brL = 0;
				}
				if (br == 100)
					break;
			}
		}

	}

}
