package zadaci_20_01_2016;

import java.util.Scanner;

/*
 * Napisati program koji ispisuje sve prijestupne godine, 10 po liniji, u rasponu godina 
 * koje korisnik unese. Program pita korisnika da unese poèetnu godinu, 
 * krajnju godinu te ispisuje sve godine u tom rasponu. 
 * Razmak izmeðu godina treba biti jedan space. 
 * 
 */

public class drugi {

	// kreiraj metodu za racunanje prijestupnih godina
	public static void prijestupna(int a, int b) {// metoda prima dva argumenta
		// deklarisimo brojac koji cemo koristiti za prelazak u novi red
		int br = 0;
		// ako je korisnik unio prvo vecu pa manju godinu,izvrsimo zamjenu
		if (a > b) {
			int privremena = 0;
			privremena = a;
			a = b;
			b = privremena;
		}
		// ispisi poruku
		System.out.println("Prijestupne godine u periodu od: " + a + " do " + b	+ " su\n");
		// napravimo petlju za trazeni period
		for (int i = a; i <= b; i++) {
			// uslov za racunanje prijestupne godine
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {

				System.out.print(i + " "); // vrsimo ispis prijestupnih godina

				br++; // ako je godina prijestupna brojac povecaj za 1
			}
			if (br == 10) {// ako je brojac jednak 10 izvrsi slijedeci kod
				System.out.println();// prelazak u novi red
				br = 0; // Nuliraj brojac
			}
		}
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// Izvrsi unos pocetnog perioda
		System.out.println("Unesite pocetnu godinu: ");
		int poc = ulaz.nextInt();
		// Izvrsi unos krajnjeg perioda
		System.out.println("Unesite krajnu godinu: ");
		int kraj = ulaz.nextInt();
		// pozovi metodu za trazeni period
		prijestupna(poc, kraj);

	}

}
