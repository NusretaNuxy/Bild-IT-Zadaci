package zadaci_24_01_2016;

import java.util.Scanner;

/*
 *  Napisati metodu koja pronalazi broj ponavljanja odreðenog karaktera u stringu. 
 *  Metoda treba da koristi sljedeæi header: public static int count(String str, char a). 
 *  Na primjer, ukoliko pozovemo metodu na sljedeæi naèin: count("Welcome", e) 
 *  metoda treba da vrati 2. Napisati program koji pita korisnika da unese string i koji 
 *  karakter želi da prebroji u datom stringu te mu ispiše koliko se puta odreðeni 
 *  karakter ponovio u zadatom stringu.
 */

public class cetvrti {
	// kreiraj metodu
	public static int count(String str, char a) {
		// kreira brojac
		int br = 0;
		// prebci string u niz
		char[] str2 = str.toCharArray();
		// prodji for petljom kroz niz
		for (int i = 0; i < str.length(); i++) {
			// ako e na "i-toj" poziciji u nizu vrijednost ista kao parametar
			// a,povecaj brojac za 1
			if (str2[i] == a) {
				br++;
			}
		}
		return br;// vrati vrijednost brojaca

	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		// izvrsite unos stringa
		System.out.print("Unesite string ");
		String str = ulaz.nextLine();
		// izvrsite unos karaktera
		System.out.print("Unesite karakter koji zelite prebrojati u stringu ");
		char a = ulaz.next().charAt(0);
		// ispisi rezultat i pozovi metodu
		System.out.print("\nU unesenom stringu, slovo " + a + " se ponavlja: "
				+ count(str, a) + " puta.");

	}

}
