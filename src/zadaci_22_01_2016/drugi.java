package zadaci_22_01_2016;

/*
 * Great circle distance predstavlja udaljenost izme�u dvije ta�ke na povr�ine sfere. 
 * Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku �irinu i du�inu dvije ta�ke.
 * Great circle distance izme�u ove dvije ta�ke mo�e biti izra�unata koriste�i se sljede�om 
 * formulom: d = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)). 
 * Napisati program koij pita korisnika da unese geografsku �irinu i du�inu u stepenima 
 * dvije ta�ke na povr�ini zemlje te mu ispisuje great circle distance. Prosje�ni radius 
 * zemlje je 6.371.01 km. Stepene koje korisnik unese trebamo promijeniti u radianse 
 * koriste�i se Math.toRadians metodom jer Java trigonometrijske metode koriste radianse. 
 * �irina i du�ina u ovoj formuli se odnose na zapad i sjever. Koristimo negativne 
 * vrijednosti da ozna�imo istok i jug. 
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
