package zadaci_01_02_2016;

import java.util.HashSet;
import java.util.Scanner;

/*
 * Napisati program koji uèitava 10 brojeva te ispisuje koilko je jedinstvenih brojeva 
 * unijeto te sve jedinstvene brojeve koji su unijeti, razmaknute jednim spaceom. 
 * Ukoliko se neki broj pojavljuje više puta, broj treba ispisati samo jednom. 
 */

public class peti {

	public static void main(String[] args) {
		// Nakon istrazivanja pronasla slijedeci hashSet
		HashSet<String> set = new HashSet<String>();
		// kreiraj niz
		String[] niz = new String[10];
		// kreiraj brojac
		int br = 0;
		// ispisi poruku i unesi 10 brojeva
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite deset brojeva:");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = ulaz.nextLine();

		}
		// ispisi poruku i prodji kroz niz
		System.out.println("Jedinstveni brojevi:");
		for (String a : niz) {
			if (set.add(a)) {
				System.out.print(a + " ");
				// Broji jedinstvene
				br++;
			}
		}
		// ispisi poruku
		System.out.println("\nJedinstvenih brojeva ima: " + br);

	}

}
