package zadaci_30_01_2016;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 *  Napisati metodu koja vraæa datum i trenutaèno vrijeme.
 */

public class cetvrti {
	// kreiraj metodu koja vraca trenutni datum i vrijeme
	public static void datum() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		System.out.println(dateFormat.format(cal.getTime()));
	}

	public static void main(String[] args) {
		// ispisi poruku i pozovi metodu
		System.out.println("Trenutni datum i vrijeme: ");
		datum();

	}

}
