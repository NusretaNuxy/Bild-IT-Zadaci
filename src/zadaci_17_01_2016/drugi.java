package zadaci_17_01_2016;

import java.util.Scanner;

/*
 *Napisati metodu koja nalazi najmanji element u nizu decimalnih vrijednosti koristeæi se 
 *sljedeæim headerom:
 *public static double min(double[ ] array)
 *Napišite potom test program koji pita korisnika da unese deset brojeva te poziva ovu 
 * metodu da vrati najmanji element u nizu.
 */

public class drugi {
	// kreiraj metodu koja prima niz tipa double

	public static double min(double[] array) {

		double mini = array[0]; // deklrisi i inicjalizuj promjenjljivu mini
		for (int i = 0; i < array.length; i++) {// kreiraj petlju za prolazak
												// kroz red
			if (array[i] <= mini) {// ispitaj da li je niz na i-tom mjestu manji
									// ili jednak od minimalne vrijednosti
				mini = array[i];// ako je manji,onda varijabli mini dodijeli
								// vrijednsot niza na i-tom mjestu

			}
		}
		return mini;//vrati vrijednost varijable mini

	}

	public static void main(String[] args) {
		// kreiraj niz tipa double
		double[] niz = new double[10];
		// izvrsite unos elemenata niza
		Scanner ulaz = new Scanner(System.in);
		System.out.println("unesite niz decimalnih brojeva:");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = ulaz.nextDouble();
		}
		// ispisi rezultat i pozovi metodu
		System.out.println("Najmanji elemenat niza je:" + min(niz));

	}

}
