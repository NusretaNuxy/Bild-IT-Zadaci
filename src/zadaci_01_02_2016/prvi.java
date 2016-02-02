package zadaci_01_02_2016;

import java.util.Scanner;

/*
 * Napisati program koji prima ASCII kod (cijeli broj izmeðu 0 i 127) te ispisuje koji 
 * je to karakter. Na primjer, ukoliko korisnik unese 69 kao ASCII kod, program mu 
 * ispisuje da je karakter sa tim brojem karakter E.
 */

public class prvi {

	public static void main(String[] args) {
		// unesite int vrijednost
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite int vrijednost za ASCII kod:");
		int a = ulaz.nextInt();
		// za unesenu int vrijednost ispisi accii kod
		System.out.println("U ASCII kodu decimalna vrijednost " + a
				+ " odgovara karakteru: " + (char) a);

	}

}
