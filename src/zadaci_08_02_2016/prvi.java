
package zadaci_08_02_2016;

/*
(Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits that are
divisible by 2 or 3.
 */

import java.math.BigDecimal;
import java.math.BigInteger;

public class prvi {

	public static void main(String[] args) {

		// kreiraj brojac
		int br = 0;
		// kreiraj pomocni string
		String str = 1 + "";
		// dodaj mu 49 nula
		for (int i = 1; i < 50; i++) {

			str += "0";
		}

		BigInteger a = new BigInteger(str);
		// Po uslovu zadatka ispitaj da li je broj djeljiv sa 2 i 3
		while (br != 10) {
			if (a.mod(new BigInteger("2")).equals(new BigInteger("0"))
					|| a.mod(new BigInteger("3")).equals(new BigInteger("0"))) {
				br++;
				System.out.println(a);

			}
			a = a.add(new BigInteger("1"));
		}
	}
}