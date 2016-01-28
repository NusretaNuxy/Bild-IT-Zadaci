package zadaci_27_01_2016;

/*
 * Palindrome prime je prosti broj koji je takoðer i palindrom. 
 * Na primjer, 131 je palindrome prime, kao i brojevi 313 i 757. 
 * Napisati program koji ispisuje prvih 100 palindrome prime brojeva, 10 brojeva po liniji.
 */

public class cetvrti {
	// kreiraj metodu za ispitivanje da li je broj prost
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

	// kreiraj metodu za ispitivanje da li je broj palindrom
	public static boolean isPalindrome(int number) {
		// pretvorimo int u string
		String temp = Integer.toString(number);
		// kreirajmo varijablu prolazak od pocetka kroz sting
		int poc = 0;
		// kreirajmo varijablu za prolazak od kraja kroz sting
		int kraj = temp.length() - 1;

		// vrti while petlju sve dok je uslov tacan
		while (temp.charAt(poc) == temp.charAt(kraj) && (poc < kraj)) {
			poc++;// inkrementuj brojac
			kraj--;// inkrementuj brojac

		}
		// ako je poc manji od kraa vrati false
		if (poc < kraj) {
			return false;
			// u suprotnom vrati true
		} else {
			return true;
		}

	}

	public static void main(String[] args) {
		// kreiraj brojac za ispis 10 brojeva u jednom redu
		int brL = 0;
		// kreira brojac za ispis prvih 100 palindrome prime brojeva
		int br = 0;

		// uzmimo interval za for petlju
		for (int i = 10; i <= 100000; i++) {
			// ako je uslov tacan ispisi broj
			if ((isPrime(i) != 0) && (isPalindrome(i) == true)) {
				System.out.print(isPrime(i) + " ");
				// povecaj brojac za red i projac za polindrom prime broj
				brL++;
				br++;
				// ako je brojac jednak 10 predji u novi redi i nuliraj
				// brojac
				if (brL == 10) {
					System.out.println();
					brL = 0;
				}
				if (br == 100) {
					break;
				}
			}
		}
	}
}
