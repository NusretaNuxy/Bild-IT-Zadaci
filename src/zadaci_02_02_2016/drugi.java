package zadaci_02_02_2016;

/*
 *Random number chooser) Write a method that returns a random number between
 *1 and 54, excluding the numbers passed in the argument. The method header is
 *specified as follows: 
 */

public class drugi {
	public static int getRandom(int[] niz) {
		// kreiraj pomocnu i varijablu za brojac
		int pom = 0;
		int br = 0;
		// generisi brojeve 1 do 54
		int a = 1 + (int) (Math.random() * 54);
		for (int i = 0; i < niz.length; i++) {
			// ukoliko je element niza razlicit od generisanog broja - povecaj
			// brojac za 1
			if (niz[i] != a) {
				br++;

			}
			// ukoliko je brojac jednak duzini niza-znaci svi elemeti niza su
			// bili razliciti od generisanog broja - dodijeli pomocnoj varijabli
			// vrijednost generisanog broja
			if (br == niz.length) {
				pom = a;
				return a;
			}

		}// vrati vrijednost pomocne varijable
		return pom;

	}

	public static void main(String[] args) {
		// kreiraj niz i dodijeli mu vrijednosti
		int[] n = { 1, 3, 9, 16, 25, 38, 54 };
		// ispisi poruku i pozovi metodu 50x
		System.out.println("Vraceni brojevi su: ");
		for (int j = 0; j < 50; j++) {
			System.out.println(getRandom(n));
		}

	}
}
