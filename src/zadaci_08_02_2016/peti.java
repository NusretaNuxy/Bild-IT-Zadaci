package zadaci_08_02_2016;

import java.math.BigDecimal;
import java.math.BigInteger;

/*
 * (Divisible by 5 or 6) Find the first ten numbers greater than Long.MAX_VALUE that are 
 * divisible by 5 or 6.
 */

public class peti {

	public static void main(String[] args) {
		// kreiraj brojac
		int brojac = 1;
		// deklarisanje long promjenljive
		long m = Long.MAX_VALUE;
		// prebacivanje u BigInteger zbog mogucnosti koristenja raznih funkcija
		BigDecimal dec = BigDecimal.valueOf(m);
		// dok je brojac manji ili jednak 5 izvrsi tijelo petljaji
		while (brojac <= 10) {
			// ispitaj uslov iz postavke zadatka
			if (dec.remainder(new BigDecimal(5)).equals(BigDecimal.ZERO)
					|| dec.remainder(new BigDecimal(6)).equals(BigDecimal.ZERO)) {
				// ispisi rezultat
				System.out.println(dec);
				brojac++;
			}
			// povecaj varijablu dec
			dec = dec.add(BigDecimal.ONE);
		}

	}

}