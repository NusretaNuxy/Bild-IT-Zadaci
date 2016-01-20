package zadaci_19_01_2016;

import java.util.Scanner;

/*
 * 
 * Pretpostavimo da uplatimo $100 svaki mjesec na �tedni ra�un koji ima godi�nju interesnu 
 * stopu od 5%. Mjese�na interesna stopa je stoga 0.05 / 12 = 0.00417. 
 * Nakon prvog mjeseca vrijednost na ra�unu postaje 100 * (1 + 0.00417) = 100.417. 
 * Nakon drugog mjeseca, vrijednost na ra�unu postaje 
 * (100 + 100.417) * (1 + 0.00417) = 201.252. 
 * Nakon tre�eg mjeseca, vrijednost na ra�unu postaje 
 * (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. 
 * Napisati program koji pita korisnika da unese mjese�ni iznos �tednje te broj mjeseci 
 * nakon kojeg bi �elio znati stanje ra�una. 
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
		System.out.println("Unesite godi�nju interesnu stopu u procentima:");
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
				+ " mjeseca stednje na Va�em ra�unu ce biti " + rezultat
				+ " KM");

	}

}
