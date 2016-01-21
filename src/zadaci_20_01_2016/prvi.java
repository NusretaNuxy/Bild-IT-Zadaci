package zadaci_20_01_2016;

import java.util.Scanner;

/*
 * 
 * Napisati program koji u�itava iznos investicije, godi�nju interesnu stopu i broj godina 
 * te vra�a budu�u vrijednost investicije koriste�i se sljede�om formulom: 
 * buducaVrijednostInvesticije = iznosInvesticije * (1 + mjesecnaInteresnaStopa)^brojGodina*12. 
 * Na primjer, ukoliko uneste kao iznos investicije 1000, 3.25 kao godi�nju interesnu stopu 
 * i 1 kao broj godina program vam vra�a 1032.98 kao buducu vrijednost investicije.
 */

public class prvi {

	public static void main(String[] args) {

		// Unesite trazene iznose od korisnika
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite iznos investicije:");
		int invest = ulaz.nextInt();// Izvrsi unos investicije
		System.out.println("Unesite godi�nju interesnu stopu:");
		float stopa = ulaz.nextFloat();// Izvrsi unos interesne stope
		System.out.println("Unesite broj godina:");
		int god = ulaz.nextInt();// Izvrsi unos godina

		// kreiraj varijablu za racunanje buduce vrijednosti investicije
		float buducaVrijednostInvesticije;
		// izvrsi racunanje mjesecne stope sa preciznoscu
		double mjesInterStop = (double) god / (1200f);
		// izvrsi racunanje vrijednosti buduce investicije
		buducaVrijednostInvesticije = invest
				* ((float) (Math.pow(1 + mjesInterStop, god * 12)));

		// ispisi rezultat
		System.out.println("Budu�a vrijednost investicije iznosi: \n " + buducaVrijednostInvesticije);

		ulaz.close();
	}

}
