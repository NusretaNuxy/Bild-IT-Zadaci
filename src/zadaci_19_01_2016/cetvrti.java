package zadaci_19_01_2016;

import java.util.Scanner;

/*
 * 
 * Napisati program koji prima 10 cijelih brojeva te ih ispisuje u obrnutom redosljedu. 
 * 
 */

public class cetvrti {

	public static void main(String[] args) {
		// kreiraj niz za smijestanje brojeva
		int[] niz = new int[10];
		// Trazi od korisnika da izvrsi unos 10 brojeva
		System.out.println("Unesite deset cijelih brojeva:");
		Scanner ulaz = new Scanner(System.in);
		for (int i = 0; i < niz.length; i++) {// smjesti brojeve u niz
			niz[i] = ulaz.nextInt();
		}
		// ispis rezultata
		System.out.println("Ispis unijetih brojeva u obrnutom redoslijedu:");
		for (int i = niz.length - 1; i >= 0; i--) {// krenimo od zadnjeg indexa
													// u nizu pa do prvog
			System.out.print(niz[i] + " ");
		}

	}

}
