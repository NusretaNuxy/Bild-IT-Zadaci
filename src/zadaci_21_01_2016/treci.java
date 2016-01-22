package zadaci_21_01_2016;

import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese godinu i prva tri slova imena mjeseca 
 * (prvo slovo uppercase) te mu ispiše broj dana u tom mjesecu. 
 * Na primjer, ukoliko korisnik kao godinu unese 2001 a kao mjesec Jan 
 * program mu ispisuje da Jan 2011 ima 31 dan.
 * 
 */

public class treci {
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
	// datoj godini. Ali sada metoda kao parametar godina uzima string
	public static void izracunaj(String mjesec, int godina) {
		// ispitaj uslov za januar(januar uvijek ima 31 dan bila godina
		// prijestupna ili ne)
		if (mjesec.equals("Jan")) {
			System.out.println("Januar " + godina + " je imao 31 dan");
		}
		// Ako je godina prijestupna februar ima 29 dana
		if ((mjesec.equals("Feb")) && (prijestupnaG(godina))) {
			System.out.println("Februar " + godina + " je imao 29 dana");
		}
		// Ako godina nije prijestupna februar ima 28 dana
		if (mjesec.equals("Feb") && (prijestupnaG(godina) == false)) {
			System.out.println("Februar " + godina + " je imao 28 dana");
		}
		// ostali mjeseci imaju isti broj dana za prijestupne i neprijestupne
		// godine
		if (mjesec.equals("Mar")) {
			System.out.println("Mart " + godina + " je imao 31 dan");
		}
		if (mjesec.equals("Apr")) {
			System.out.println("April " + godina + " je imao 30 dana");
		}
		if (mjesec.equals("Maj")) {
			System.out.println("Maj " + godina + " je imao 31 dan");
		}
		if (mjesec.equals("Jun")) {
			System.out.println("Juni " + godina + " je imao 30 dana");
		}
		if (mjesec.equals("Jul")) {
			System.out.println("Juli " + godina + " je imao 31 dan");
		}
		if (mjesec.equals("Aug")) {
			System.out.println("August " + godina + " je imao 30 dana");
		}
		if (mjesec.equals("Sep")) {
			System.out.println("Septembar " + godina + " je imao 30 dana");
		}
		if (mjesec.equals("Okt")) {
			System.out.println("Oktobar " + godina + " je imao 31 dan");
		}
		if (mjesec.equals("Nov")) {
			System.out.println("Novembar " + godina + " je imao 30 dana");
		}
		if (mjesec.equals("Dec")) {
			System.out.println("Decembar " + godina + " je imao 31 dan");
		}
	}

	public static void main(String[] args) {
		String mjesec;
		Scanner ulaz = new Scanner(System.in);

		// izvrsite unos mjeseca ali sada kao string
		System.out
				.println("unesite prva tri slova od mjeseca NAPOMENA: prvo slovo veliko");
		mjesec = ulaz.nextLine();
		// izvrsite unos godine
		System.out.println("unesite godinu");
		int god = ulaz.nextInt();

		// pozovi metodu
		izracunaj(mjesec, god);
		ulaz.close();
	}

}
