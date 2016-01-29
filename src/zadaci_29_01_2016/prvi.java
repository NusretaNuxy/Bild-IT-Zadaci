package zadaci_29_01_2016;

/*
 * Napisati program koji nasumièno generiše cijeli broj izmeðu 1 i 12 te ispisuje 
 * ime mjeseca za taj broj. (Januar za 1, Ferbruar za 2....)
 */

public class prvi {

	public static void main(String[] args) {
		// generisi slucajan broj od 1 do 12

		int slucajanBroj = (int) (Math.random() * (1 + 11) + 1);

		System.out.println(slucajanBroj);
		// ispitaj uslove ako je generisano broj 1 ispisi JANUAR
		// ako je generisani broj 2 ispisi FEBRUAR itd
		if (slucajanBroj == 1) {
			System.out.println("JANUAR");
		} else if (slucajanBroj == 2) {
			System.out.println("FEBRUAR");
		}

		else if (slucajanBroj == 3) {
			System.out.println("MART");
		} else if (slucajanBroj == 4) {
			System.out.println("APRIL");
		} else if (slucajanBroj == 5) {
			System.out.println("MAJ");
		} else if (slucajanBroj == 6) {
			System.out.println("JUNI");
		} else if (slucajanBroj == 7) {
			System.out.println("JULI");
		} else if (slucajanBroj == 8) {
			System.out.println("AUGUST");
		} else if (slucajanBroj == 9) {
			System.out.println("SEPTEMBAR");
		} else if (slucajanBroj == 10) {
			System.out.println("OKTOBAR");
		} else if (slucajanBroj == 11) {
			System.out.println("NOVEMBAR");
		} else {
			System.out.println("DECEMBAR");
		}
	}

}