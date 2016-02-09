package zadaci_08_02_2016;

import java.math.BigInteger;

/*
 *  (Large prime numbers) Write a program that finds five prime numbers larger 
 *  than Long.MAX_VALUE.
 */

public class treci {

	public static void main(String[] args) {
		// kreiraj brojac
		int brojac = 1;
		// deklarisanje long promjenljivu
		long m = Long.MAX_VALUE;
		// prebacivanje u BigInteger zbog mogucnosti koristenja raznih funkcija
		BigInteger n = BigInteger.valueOf(Long.MAX_VALUE);

		// dok je brojac manji ili jednak 5 izvrsi tijelo petljaji
		while (brojac <= 5) {
			// metoda koja provjerava da li je broj prost
			if (n.isProbablePrime(0)) {
				// ispisi rezultat
				System.out.println(n);
				brojac++;
			}
			// povecaj varijablu n
			n = n.add(BigInteger.ONE);
		}
	}

}