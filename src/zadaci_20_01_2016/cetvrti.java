package zadaci_20_01_2016;

import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese neki string te mu ispisuje sve 
 * karaktere koji se nalaze na neparnim pozicijama. Na primjer, ako korisnik unese string 
 * Beijing Chicago, program vraæa BiigCiao. 
 * 
 */
public class cetvrti {

	public static void main(String[] args) {
		// izvrsi unos stringa

		String string;// deklarisimo string
		Scanner ulaz = new Scanner(System.in);
		System.out.println("unesite string");
		string = ulaz.nextLine();
		// kreiraj varijablu prazno polje za poredjenje
		char prazpolje = ' ';

		// prebaci string u niz
		char[] str = string.toCharArray();
		// kreiraj pomocni niz
		char[] pomocni = new char[str.length + 1];
		// prvom elementu pomocnog niza dodijeli space
		pomocni[0] = ' ';
		// smjesti elemente niza u pomocni niz pomjerene za index 1
		for (int i = 0; i < str.length; i++) {
			pomocni[i + 1] = str[i];
		}

		// vrti petlju kroz niz
		for (int i = 0; i < pomocni.length; i++) {
			// ispitaj uslov da li na i-tom mjestu prazno polje te da li je i djeljivo sa 2
			if ((pomocni[i] != prazpolje) && (i % 2 != 0)) {
				System.out.print(pomocni[i]);// ispisi rezultat
			}
		}

	}

}
