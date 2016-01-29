package zadaci_29_01_2016;

import java.util.Scanner;

/*
 * Napisati program koji igra sa protivnikom rock-paper-scissors. 
 * (papir-bunar-makaze ili tako nekako po naški) Program nasumièno generiše brojeve 
 * 0, 1 i 2 koji predstavljaju papir, bunar i makaze. 
 * Program pita korisnika da unese 0, 1 ili 2 te mu ispisuje poruku da li je 
 * korisnik pobijedio, da li je raèunar pobijedio ili je bilo neriješeno. 
 */

public class drugi {

	public static void main(String[] args) {
		// kreiraj dvije varijable
		int g = 0;
		int k = 0;
		// ispisi korisniku poruku
		System.out.println("Unesite 1 za papir;2 za bunar;3 za makaze: ");
		Scanner ulaz = new Scanner(System.in);
		// kreiraj niz
		String[] niz = { "Papir", "Bunar", "Makaze" };
		// vrsi do-while petlju sve dok je uslov tacan
		do {
			// ispisi korisniku da unese broj
			System.out.print("Vi:");
			int n = ulaz.nextInt();
			// kompjuter generise slucajan broj od 1 do 3
			int br = 1 + (int) (Math.random() * 3);
			// ako je ono sto je generisao racunar jednako onom sto je korisnik
			// unio
			// ispisi nerijeseno
			if (n == br) {
				System.out.println("Vi " + niz[br - 1]);
				System.out.println("Kompjuter " + niz[br - 1]);
				System.out.println("Nerijeseno!");
			}
			// Ispitaj uslove: npr.ako je korisnik unio 1(Bunar),a kompjuter
			// generisao 2(makaze),korisnik dobija poen.ispisi poruke i
			// povecaj za 1 korisnikov brojac
			// identicno su uradjeni i ostali uslovi
			if ((n == 1) && (br == 2)) {
				System.out.println("Vi " + niz[0]);
				System.out.println("Kompjuter " + niz[1]);
				System.out.println("Vi dobijate poen!");
				g++;
			}
			if ((n == 1) && (br == 3)) {
				System.out.println("Vi " + niz[0]);
				System.out.println("Kompjuter " + niz[2]);
				System.out.println("Kompjuter dobija poen!");
				k++;
			}
			if ((n == 2) && (br == 1)) {
				System.out.println("Vi " + niz[1]);
				System.out.println("Kompjuter " + niz[0]);
				System.out.println("Kompjuter dobija poen!");
				k++;
			}
			if ((n == 2) && (br == 3)) {
				System.out.println("Vi " + niz[1]);
				System.out.println("Kompjuter " + niz[2]);
				System.out.println("Vi dobijate poen!");
				g++;
			}
			if ((n == 3) && (br == 1)) {
				System.out.println("Vi " + niz[2]);
				System.out.println("Kompjuter " + niz[0]);
				System.out.println("Vi dobijate poen!");
				g++;
			}
			if ((n == 3) && (br == 2)) {
				System.out.println("Vi " + niz[2]);
				System.out.println("Kompjuter " + niz[1]);
				System.out.println("Kompjuter dobija poen!");
				k++;
			}
			// kad brojac od korisnika,ili brojac od racunara dostigne
			// vrijednost 3 prekini petlju
			if ((g == 3) || (k == 3)) {
				break;
			}

		} while ((g != 3) || (k != 3));
		// ispitaj ciji je brojac veci i proglasi pobjednika :)
		if (g > k) {
			System.out.println("Vi ste pobijedili!");
		} else {
			System.out.println("Kompjuter je pobijedio!");
		}
	}
}
