package zadaci_24_01_2016;

/*
 * Napisati program koji ispisuje sve mogu�e kombinacije za biranje dva broja u rasponu od 
 * 1 do 7. Tako�er, program ispisuje broj svih mogu�ih kombinacija.  
 * Dakle, program treba da ispi�e sve mogu�e parove brojeva u datom rasponu, 
 * krenuv�i sa 1 2, 1 3, 1 4, itd. Broj mogu�ih kombinacija je 21. 
 */

public class treci {

	public static void main(String[] args) {
		// krairaj petlju od broja 1 do broja 7
		for (int i = 1; i < 7; i++) {
			// kreiraj drugu petlju od broja i do broja 7(da se ne bi
			// kombinacije ponavljale)
			for (int j = i; j < 7; j++) {
				// izvrsi ispis kombinacija
				System.out.println(i + " " + j);
			}
		}

	}

}
