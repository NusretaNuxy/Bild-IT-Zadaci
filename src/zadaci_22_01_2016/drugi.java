package zadaci_22_01_2016;

/*
 * Great circle distance predstavlja udaljenost izmeðu dvije taèke na površine sfere. 
 * Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku širinu i dužinu dvije taèke.
 * Great circle distance izmeðu ove dvije taèke može biti izraèunata koristeæi se sljedeæom 
 * formulom: d = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)). 
 * Napisati program koij pita korisnika da unese geografsku širinu i dužinu u stepenima 
 * dvije taèke na površini zemlje te mu ispisuje great circle distance. Prosjeèni radius 
 * zemlje je 6.371.01 km. Stepene koje korisnik unese trebamo promijeniti u radianse 
 * koristeæi se Math.toRadians metodom jer Java trigonometrijske metode koriste radianse. 
 * Širina i dužina u ovoj formuli se odnose na zapad i sjever. Koristimo negativne 
 * vrijednosti da oznaèimo istok i jug. 
 * 
 */

import java.util.Scanner;

public class drugi {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		// unesi tacke od korisnika
		System.out.println("unesite x1 tacku : ");
		float x1 = ulaz.nextFloat();
		System.out.println("unesite y1 tacku : ");
		float y1 = ulaz.nextFloat();
		System.out.println("unesite x2 tacku : ");
		float x2 = ulaz.nextFloat();
		System.out.println("unesite y2 tacku : ");
		float y2 = ulaz.nextFloat();

		// prebaci tacke u radius

		float x11 = (float) Math.toRadians(x1);
		float y11 = (float) Math.toRadians(y1);
		float x22 = (float) Math.toRadians(x2);
		float y22 = (float) Math.toRadians(y2);

		// racunanje rezultata po formuli i pomnozi sa radiousom
		float distanca = (float) (6371.01 * Math.acos(Math.sin(x11)
				* Math.sin(x22) + Math.cos(x11) * Math.cos(x22)
				* Math.cos(y11 - y22)));
		// ispisi rezultat
		System.out.println("Great circle distance is:\n" + distanca);
	}

}
