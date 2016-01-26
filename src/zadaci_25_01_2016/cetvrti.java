package zadaci_25_01_2016;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * 
 * Napisati program koji pita korisnika da unese broj minuta (npr. 1 milijardu) te 
 * ispiše korisniku koliko je to u godinama i danima. Zbog jednostavnosti, pretpostavimo 
 * da godina ima 365 dana.
 */

public class cetvrti {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		// ispisi korisniku poruku da unese broj sekudni
		System.out.println("Unosite broj sekundi: ");
		// posto se ocekuje unos velikog int broja varijablu je kreirana kao tip
		// BigInteger
		BigInteger sec = ulaz.nextBigInteger();
		// da bismo mogli izvršiti matematicku operaciju dijeljenja moramo
		// varijablu iz BigInteger prebaciti u double
		double Sec = sec.doubleValue();
		// izracunaj broj godina na osnovu unesenih sekundi
		int god = (int) Sec / (365 * 86400);
		// izracunaj koliki je ostatak od broja godina
		int ost = (int) Sec % (365 * 86400);
		// na osnovu izracunatog ostatka izracunaj broj dana
		int dan = ost / (24 * 3600);
		// ispisi rezultate
		System.out.println(sec + " sekundi ima:\nGodina: " + god
				+ "\nDana " + dan);

	}
}
