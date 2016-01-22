package zadaci_21_01_2016;

import java.util.Scanner;

/*
 * 
 * Napisati program koji pita korisnika da unese mjesec i godinu te mu ispiše broj dana 
 * u datom mjesecu. Na primjer, ukoliko korisnik unese kao godinu 2012 a kao mjesec 2, 
 * program treba ispisati da je Februar 2012 imao 29 dana. 
 * Ukoliko korisnik unese kao godinu 2015 a kao mjesec 3, program treba ispisati da je 
 * Mart 2015 imao 31 dan. 
 */

public class drugi {
	// kreiraj metodu za racunanje prijestupne godine

	public static boolean prijestupnaG(int godina) {
		// na osnovu parametra metode ispitaj uslov koji vrijedi za prijestupnu
		// godinu
		if ((godina % 4 == 0 && godina % 100 != 0) || (godina % 400 == 0)) {
			return true;// ako je uslov tacan vrati true
		}
		// u suprotnom vrati false
		return false;
	}

	// kreiraj metodu koja ce na osnovu mjeseca i godine vratiti broj dana u
	// datoj godini
	public static void izracunaj(int mjesec, int godina) {
		// ispitaj uslov za januar(januar uvijek ima 31 dan bila godina
		// prijestupna ili ne)
		if (mjesec == 1) {
			System.out.println("Januar " + godina + " je imao 31 dan");
		}
		// Ako je godina prijestupna februar ima 29 dana
		if ((mjesec == 2) && (prijestupnaG(godina))) {
			System.out.println("Februar " + godina + " je imao 29 dana");
		}
		// Ako godina nije prijestupna februar ima 28 dana
		if ((mjesec == 2) && (prijestupnaG(godina) == false)) {
			System.out.println("Februar " + godina + " je imao 28 dana");
		}
		// ostali mjeseci imaju isti broj dana za prijestupne i neprijestupne
		// godine
		if (mjesec == 3) {
			System.out.println("Mart " + godina + " je imao 31 dan");
		}
		if (mjesec == 4) {
			System.out.println("JApril " + godina + " je imao 30 dana");
		}
		if (mjesec == 5) {
			System.out.println("Maj " + godina + " je imao 31 dan");
		}
		if (mjesec == 6) {
			System.out.println("Juni " + godina + " je imao 30 dana");
		}
		if (mjesec == 7) {
			System.out.println("Juli " + godina + " je imao 31 dan");
		}
		if (mjesec == 8) {
			System.out.println("August " + godina + " je imao 30 dana");
		}
		if (mjesec == 9) {
			System.out.println("Septembar " + godina + " je imao 30 dana");
		}
		if (mjesec == 10) {
			System.out.println("Oktobar " + godina + " je imao 31 dan");
		}
		if (mjesec == 11) {
			System.out.println("Novembar " + godina + " je imao 30 dana");
		}
		if (mjesec == 12) {
			System.out.println("Decembar " + godina + " je imao 31 dan");
		}
	}

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		// izvrsite unos godine
		System.out.println("unesite godinu");
		int god = ulaz.nextInt();
		// izvrsite unos mjeseca
		System.out.println("unesite mjesec");
		int mjesec = ulaz.nextInt();
		// pozovi metodu
		izracunaj(mjesec, god);
	}

}
