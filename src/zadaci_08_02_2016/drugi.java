package zadaci_08_02_2016;

import java.math.BigDecimal;
import java.math.BigInteger;

public class drugi {
	// pokusaj da ga uradim preko rekurzivne metode,malo fali do finisa :S

	public static void povecaj(BigDecimal index, int n) {
		// dve dok je n vece ili jednako 1 pozivaj metodu
		if (n >= 1) {
			// kreiraj dvije long varijable
			long pomocna, broj;
			// prebaci index u long
			pomocna = index.longValue();
			// izvraadi korijen
			broj = (long) Math.sqrt(pomocna);
			// prebaci u bigDecimal
			BigDecimal dec = new BigDecimal(broj);
			BigDecimal squared = dec.multiply(dec);

			System.out.println(broj);

			povecaj(dec.add(BigDecimal.ONE), n - 1);
		}
	}

	public static void main(String[] args) {
		// brebaci long.MAX_VALUE u BigDecimal
		BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE);
		// pozovi rekurzivnu metodu
		povecaj(longMaxValue, 10);

	}
}
