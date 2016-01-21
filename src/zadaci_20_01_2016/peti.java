package zadaci_20_01_2016;

import java.util.Scanner;

/*
 * Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijeće v, mozemo izracunati 
 * minimalnu duzinu piste potrebne da avion uzleti koristeci se sljedecom formulom: 
 * duzina = v * v / 2a. 
 * Napisati program koji pita korisnika da unese v u m/s i a u m/s² te ispisuje korisniku 
 * minimalnu duzinu piste. 
 * (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje duzina piste je 514.286)
 */

public class peti {
	// kreiraj metodu
	public static void duzina(double x, double y) {
		// Izracunaj duzinu piste pomocu zadane formule
		double duz = (double) (x * (x / (2 * y)));
		// zaokruzi rezutat na tri decimale
		double rez = Math.round(duz * 1000.0) / 1000.0;
		// ispisi rezultat
		System.out.println("Za unesenu brzinu uzlijetana aviona " + x
				+ " i ubrzane kojim avion uzlijece " + y
				+ "\nduzina piste je: " + rez);

	}

	public static void main(String[] args) {
		// Unesite trazene iznose od korisnika
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite brzinu kojom avion uzlijece u m/s:");
		double v = ulaz.nextDouble();// Izvrsi unos brzine

		System.out.println("Unesite ubrzanje aviona  u m/s²");
		double a = ulaz.nextDouble();// Izvrsi unos ubrzanja
		// pozovi metodu
		duzina(v, a);

	}

}
