package zadaci_22_01_2016;

/*
 * 
 * Napisati metodu koja pretavara milisekunde u sate, minute i sekunde. Metoda treba da 
 * koristi sljedeæi header: public static String convertMillis(long millis). 
 * Metoda treba da vraæa vrijeme kao string u formatu sati:minute:sekunde.  
 * Na primjer convertMillis(100000) treba da vrati 0:1:40.
 */

public class peti {
	public static String convertMillis(long millis) {
		// formule za racunanje sekundi,minuta i sati
		long sec = (millis / 1000) % 60;
		long min = (millis / (1000 * 60)) % 60;
		long sat = (millis / (1000 * 60 * 60)) % 24;
		// formatiranje stringa u obliku hh:mm:ss
		String vrijeme = String.format("%02d:%02d:%02d", sat, min, sec);

		// vrati formatiran stirng
		return vrijeme;
	}

	public static void main(String[] args) {
		// pozovi metodu i ispisi vrijeme u trazenom formatu
		System.out.println(convertMillis(100000));
	}

}
