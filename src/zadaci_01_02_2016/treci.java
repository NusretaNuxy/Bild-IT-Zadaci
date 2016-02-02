package zadaci_01_02_2016;

import java.util.Scanner;

/*
 * U javi, short vrijednost se sprema u samo 16 bita. Napisati program koji pita korisnika 
 * da unese short broj te mu ispiše svih 16 bita za dati cijeli broj. Na primjer, ukoliko 
 * korisnik unese broj 5 - program mu ispisuje 0000000000000101
 */

public class treci {

	public static void main(String[] args) {
		//kreiraj vrijablu tim short
		short x;
		//ispisi poruku korisniku da izvrsi unos short tipa
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite short broj");
		x = ulaz.nextShort();
		//isprintaj poruku i prebaci integer u binarni sistem
		System.out.println(Integer.toBinaryString(0xFFFF & x));

	}

}
