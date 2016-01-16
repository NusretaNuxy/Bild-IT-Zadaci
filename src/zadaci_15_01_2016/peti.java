package zadaci_15_01_2016;

import java.util.Scanner;

/*
 * 
 * Napisati program koji uèitava niz brojeva, pronalazi najveæi broj te ispisruje koliko 
 * se puta taj broj ponavlja. Pretpostavimo da se unos brojeva završava sa nulom.
 */
public class peti {

	public static void main(String[] args) {
		// kreiraj skener
		Scanner ulaz = new Scanner(System.in);

		// deklarisi niz,varijablu max i brojac br
		int max = 0;
		int[] niz = new int[10];
		int br = 0;
		System.out.println("Unesite elelemnte niza");
		// unesite clanove niza
		for (int i = 0; i < niz.length; i++) {
			niz[i] = ulaz.nextInt();
		}
		
		//Ispisi niz
		System.out.print("Uneseni niz je\n");
		for (int i = 0; i < niz.length; i++) {
		System.out.print(niz[i] + " ");
		}
		
		
		// prodjimo kroz elemente niza i vidimo koji elemenat je maksimalan

		for (int i = 0; i < niz.length; i++) {
			if (max < niz[i]) {
				max = niz[i];
			}

		}
		// prodjimo kroz niz da vidimo koliko puta matrica sadrzi maksimalan
		// broj
		for (int i = 0; i < niz.length; i++) {
			if (max == niz[i]) {
				br++;
			}

		}

		//ispisimo rezultat
		System.out.println("\nnajveci elemnat matrice je: "+ max+ " a ponavlja se "+br + " puta");
		
	}

}
