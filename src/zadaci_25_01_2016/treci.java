package zadaci_25_01_2016;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * Ako pozovemo metodu System.currentTimeMillis() dobijemo broj milisekundi od 
 * 1. januara 1970 do trenutka pozivanja metode. Napisati program koji ispisuje trenutaèni
 * datum i vrijeme u formatu "Trenutni datum i vrijeme: 22. juli, 2015 19:59:47"
 */

public class treci {

	public static void main(String[] args) {
		// preko metode System.currentTimeMillis() vrati broj sekundi od
		// 01.01.1970 god
		long Vrijeme = System.currentTimeMillis();
		// ispisi poruku korisniku
		System.out.println("Broj milisekundi od 01.01.1970.: " + Vrijeme);
		// ispisi poruku za trenutni datum i vrijeme
		System.out.println("Trenutni datum i vrijeme: ");
		// pomocu navedene dvije klase dobicemo trenutni datum i vrijeme:
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		System.out.println(dateFormat.format(cal.getTime()));
	}

}
