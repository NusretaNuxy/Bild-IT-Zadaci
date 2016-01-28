package zadaci_27_01_2016;

import java.util.Scanner;

/*
 * (Izraèunavanje napojnice) Napisati program koji uèitava ukupan iznos raèuna koji treba 
 * uplatiti kao i procenat tog raèuna kojeg želimo platiti kao napojnicu te izraèunava 
 * ukupan raèun i napojnicu. Na primjer, ukoliko korisnik unese 10 kao raèun i 15 % kao 
 * procenat za napojnicu program treba da ispiše da je ukupan raèun za uplatiti 11.5 a 
 * napojnica 1.5. 
 */

import java.util.Scanner;

public class prvi {

	public static void main(String[] args) {
		// varijable za napojnicu i iznos racuna
		double platiti;
		double napojnica;

		Scanner ulaz = new Scanner(System.in);
		// izvrsi unos iznosa racuna od korisnika
		System.out.println("Unesite iznos raèuna ");
		int racun = ulaz.nextInt();
		// izvrsite unos napojnice
		System.out.println("Unesite iznos napojnice");
		int nap = ulaz.nextInt();
		// izracunaj napojnicu
		napojnica = (double) (racun * nap) / 100;
		// Izracunaj ukupan racun
		platiti = (double) racun + napojnica;
		// ispisi rezultat
		System.out.println("Vrijednost raèuna koji trebate platiti je "
				+ platiti + "\nUkupna vrijednost napojnice je " + napojnica);

	}

}
