package zadaci_25_01_2016;

import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese imena tri grada te ih ispiše u abecednom 
 * redu. Na primjer, ukoliko korisnik unese Chicago, Los Angeles i Atlanta kao gradove, 
 * program vraæa Atlanta, Chicago, Los Angeles.
 */

public class prvi {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.print("Unesite prvi grad: ");
		String grad1 = ulaz.nextLine();
		System.out.print("Unesite drugi grad: ");
		String grad2 = ulaz.nextLine();
		System.out.print("Unesite treci grad: ");
		String grad3 = ulaz.nextLine();

	

		// Koristimo compareTo metodu,npr grad1.compareTo(grad2) < 0
		// Poredimo string "grad1" sa stringom "grad2"- ako je manji od 0 onda
		// je "grad1" manji,itd. svaki sa svakim poredimo dok ne dobijemo
		// abecedni poredak
		if (grad1.compareTo(grad2) < 0 && grad1.compareTo(grad3) < 0) {

			if (grad2.compareTo(grad3) < 0)
				// ispisi rezultat poredjenja ako su uslovi tacni
				System.out.println(grad1 + ", " + grad2 + ", " + grad3);
			//ako nije uslov tacan pogledaj slijedeci i tako redom.
			else
				System.out.println(grad1 + ", " + grad3 + ", " + grad2);

		} else if (grad2.compareTo(grad1) < 0 && grad2.compareTo(grad3) < 0) {
			if (grad1.compareTo(grad3) < 0)
				System.out.println(grad2 + ", " + grad1 + ", " + grad3);
			else
				System.out.println(grad2 + ", " + grad3 + ", " + grad1);
	
		} else if (grad3.compareTo(grad1) < 0 && grad3.compareTo(grad2) < 0) {
			if (grad1.compareTo(grad3) < 0)
				System.out.println(grad3 + ", " + grad1 + ", " + grad2);
			else
				System.out.println(grad3 + ", " + grad2 + ", " + grad1);
		}

		

	}

}