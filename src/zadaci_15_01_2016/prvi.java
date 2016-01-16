package zadaci_15_01_2016;

/*
 * 
 * Napisati sljedeæu metodu koja vraæa najveæu vrijednosti u ArrayListu Integera. 
 * Metoda vraæa null ukoliko je lista null iil ukoliko lista sadrži 0 elemenata.
 * public static Integer max(ArrayList<Integer> list)
 */
//importovanje bibiloteka
import java.util.ArrayList;
import java.util.Scanner;

public class prvi {

	public static int najveci(ArrayList m) {

		int max = 0; // deklaracija i inicijalizacija varijable m

		// prolazimo kroz listu
		for (int i = 0; i < m.size(); i++) {
			if (max < (int) m.get(i)) {
				max = (int) m.get(i);
			}
		}

		return max;
	}

	public static void main(String[] args) {
		// Kazi korisniku da unese elemente liste
		System.out.println("Unesite elemente u listu:");
		// Izvriste unos elemenata liste m
		Scanner ulaz = new Scanner(System.in);
		ArrayList m = new ArrayList();

		// dodajte elemente u listu

		for (int i = 0; i < 10; i++) {
			int broj = ulaz.nextInt();
			m.add(broj);
		}

		// ispisite reuzltat
		System.out.println("najveci element liste je: " + najveci(m));

	}

}
