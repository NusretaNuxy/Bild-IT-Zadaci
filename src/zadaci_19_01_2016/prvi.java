package zadaci_19_01_2016;

import java.util.Scanner;

/*
 * 
 * Pretpostavimo da uplatimo $100 svaki mjesec na štedni raèun koji ima godišnju interesnu 
 * stopu od 5%. Mjeseèna interesna stopa je stoga 0.05 / 12 = 0.00417. 
 * Nakon prvog mjeseca vrijednost na raèunu postaje 100 * (1 + 0.00417) = 100.417. 
 * Nakon drugog mjeseca, vrijednost na raèunu postaje 
 * (100 + 100.417) * (1 + 0.00417) = 201.252. 
 * Nakon treæeg mjeseca, vrijednost na raèunu postaje 
 * (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. 
 * Napisati program koji pita korisnika da unese mjeseèni iznos štednje te broj mjeseci 
 * nakon kojeg bi želio znati stanje raèuna. 
 */

public class prvi {

	public static void main(String[] args) {
		// Unesite trazene iznose od korisnika
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite mjesecni iznos stednje:");
		int stednja = ulaz.nextInt();// Izvrsi unos iznosa stednje
		System.out
				.println("Unesite broj mjeseci za koji zelite vidjeti izos stednje:");
		int brmjeseci = ulaz.nextInt();// Izvrsi unos broja mjeseci
		System.out.println("Unesite godišnju interesnu stopu u procentima:");
		int stopa = ulaz.nextInt();// Izvrsi unos kamatne stope

		double Mstopa = ((stopa / 1200f));// Izracunaj mjesecnu kamatnu stopu sa
											// preciznoscu

		double rezultat = (1 + Mstopa);// racunaj za prvi mjesec stanje na
										// racunu

		// racunaj iznos za trazeni broj mjeseci
		for (int i = 0; i < brmjeseci; i++) {
			rezultat += stednja * (1 + Mstopa);
		}
		// Ispisi reultat
		System.out.println("Poslije " + brmjeseci
				+ " mjeseca stednje na Vašem raèunu ce biti " + rezultat
				+ " KM");

	}

}
