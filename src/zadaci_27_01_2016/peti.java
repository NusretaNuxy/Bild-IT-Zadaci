package zadaci_27_01_2016;

import java.util.Scanner;

/*
 * Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva razlièita pakovanja. 
 * Želimo napisati program koji uporeðuje cijene ta dva pakovanja. 
 * Program pita korisnika da unese težinu i cijenu oba pakovanja te ispisuje koje 
 * pakovanje ima bolju cijenu.
 */

public class peti {
	public static double poredi(double tezina, double cijena) {
		double koef;
		koef = (double) tezina / cijena;
		return koef;

	}

	public static void main(String[] args) {
		double tezina1, tezina2, cijena1, cijena2;

		Scanner ulaz = new Scanner(System.in);
		// izvrsi unos tezine prvog pakovanja
		System.out.print("Unesite tezinu prvog pakovanja: ");
		tezina1 = ulaz.nextDouble();
		// izvrsite unos cijene prvog pakovanja
		System.out.print("Unesite cijenu prvog pakovanja");
		cijena1 = ulaz.nextDouble();

		// izvrsi unos tezine drugog pakovanja
		System.out.print("\nUnesite tezinu drugog pakovanja: ");
		tezina2 = ulaz.nextDouble();
		// izvrsite unos cijene drugog pakovanja
		System.out.print("Unesite cijenu drugog pakovanja");
		cijena2 = ulaz.nextDouble();
		if (poredi(tezina1, cijena1) < poredi(tezina2, cijena2)) {
			System.out.print("Pakovanje 2 ima bolju cijenu!");
		} else {
			System.out.print("Pakovanje 1 ima bolju cijenu!");
		}

	}

}
