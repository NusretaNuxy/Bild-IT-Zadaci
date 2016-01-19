package zadaci_18_01_2016;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 
 * Napisati program koji uèitava neodreðeni broj cijelih brojeva (nula prekida unos) 
 * te ispisuje koliko je brojeva bilo iznad ili jednako prosjeku svih unešenih brojeva 
 * a koliko je bilo brojeva ispod prosjeka. Pretpostavimo da je maksimalan niz brojeva 
 * koje korisnik može unijeti 100.
 */
public class peti {

	public static void main(String[] args) {
		// Ispisi poruku za unos brojeva

		System.out.println("Unesite brojeve, sa nulom vršite prekid unosa:");
		Scanner ulaz = new Scanner(System.in);
		int brojac = 0;// brojac unesenih brojeva
		int iznadProsjek = 0;// brojac za broj unesenih brojeva iznad prosjeka
		int ispodProsjek = 0;// brojac za broj unesenih brojeva ispod prosjeka
		int jednProsjek = 0;// brojac za broj unesenih brojeva koji su jednaki
							// prosjeku
		int suma = 0;// varijabla za sumu
		double prosjek = 0;// varijabla za prosjek

		ArrayList<Integer> brojevi = new ArrayList<>();// kreiraj listu za
														// smjestanje unesenih
														// brojeva

		int broj = ulaz.nextInt();// izvrsi prvi unos

		do {// izvrsavaj tijelo "do" petlje,sve dok je uslov u while tacan
			broj = ulaz.nextInt();// izvrsi unos

			brojac++;// povecaj brojac za 1

			brojevi.add(broj);// dodaj uneseni broj u listu

			suma = suma + broj;// dodaj uneseni broj sumi
		}

		while (broj != 0);

		prosjek = (double) suma / (brojac - 1);// racunanje prosjeka!brojac se
												// poveca za 1 i kad se nula
												// unese pa ne dobijemo validan
												// rezultat.Iz tog razloga u
												// racunanju prosjeka imamo
												// (brojac-1)

		for (int i = 0; i < brojevi.size(); i++) {// petlja za prolazak kroz
													// elemente liste
			if (brojevi.get(i) < prosjek) {// ako je elemenat liste manji od
											// prosjeka
				ispodProsjek++;// povecaj brojac za 1

			} else if (brojevi.get(i) > prosjek) {
				iznadProsjek++;
			} else {
				jednProsjek++;
			}

		}
		// ispisi rezultat
		System.out.println("Prosjek brojeva je:" + prosjek + "\nUnijeli ste "
				+ iznadProsjek + " brojeva iznad prosjeka" + "\nUnijeli ste "
				+ ispodProsjek + " brojeva ispod prosjeka" + "\nUnijeli ste "
				+ jednProsjek + " brojeva jednakih prosjeku");

	}
}
