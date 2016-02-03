package zadaci_02_02_2016;

/*
 *(Count single digits) Write a program that generates 100 random integers between
 * 0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,say
 * counts, to store the counts for the number of 0s, 1s, ..., 9s.)
 */

public class prvi {

	public static void main(String[] args) {
		// kreiraj niz za vrijednosti od 0 do 9
		int[] niz = new int[10];
		// dodijeli vrijednost elemntima niza
		for (int i = 0; i < 10; i++) {
			niz[i] = i;
		}
		// kreiraj niz za brojac ponavljanja elemenata prethodnog niza
		int[] brojac = new int[10];
		// napravi petlju od 0 do 100
		for (int j = 0; j < 100; j++) {
			// generisi brojeve od 0 do 9
			int a = (int) (Math.random() * 10);
			// za svaki generisani broj uradi inkrement njegovog brojaca
			brojac[a]++;
		}
		// ispisi poruku korisniku
		System.out.println("Brojevi od 0 do 9 ukupno su generisani\n");
		// ispisi rezultat
		for (int i = 0; i < 10; i++) {
			System.out.println("Broj: " + niz[i] + " generisan je " + brojac[i]
					+ " puta!");

		}
	}

}
