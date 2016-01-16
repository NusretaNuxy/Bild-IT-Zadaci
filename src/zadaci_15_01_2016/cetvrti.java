package zadaci_15_01_2016;

/*
 * Napišite program koji generiše 100 nasumiènih cijelih brojeva izmeðu 0 i 9,
 * te ispisuje koliko se puta koji broj ponovio.
 */

public class cetvrti {

	public static void main(String[] args) {

		// deklarisi brojace
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int g = 0;
		int h = 0;
		int i = 0;
		int j = 0;

		// napraviti petlju za generisaje 100 nasumicnih brojeva
		for (int k = 0; k < 100; k++) {
			//generisanje slucajnih brojeva od 0 do 9
			int slucajanBroj = (int) (Math.random() * 10);
			System.out.println(slucajanBroj);
			
			//ukoliko je slucajan broj jedank 0 uradi inkrement brojaca,identicno uraditi i za ostale
			
			if (slucajanBroj == 0) {
				a++;
			}

			if (slucajanBroj == 1) {
				b++;
			}

			if (slucajanBroj == 2) {
				c++;
			}

			if (slucajanBroj == 3) {
				d++;
			}

			if (slucajanBroj == 4) {
				e++;
			}

			if (slucajanBroj == 5) {
				f++;
			}

			if (slucajanBroj == 6) {
				g++;
			}

			if (slucajanBroj == 7) {
				h++;
			}

			if (slucajanBroj == 8) {
				i++;
			}

			if (slucajanBroj == 9) {
				j++;
			}

		}
		// ispis rezultata
		System.out.println("generisanih nula ima" + a + "\ngenerasnih 1 ima "
				+ b + "\ngenerasnih 2 ima " + c + "\ngenerasnih 3 ima " + d
				+ "\ngenerasnih 4 ima " + e + "\ngenerasnih 5 ima " + f
				+ "\ngenerasnih 6 ima " + g + "\ngenerasnih 7 ima " + h
				+ "\ngenerasnih 8 ima " + i + "\ngenerasnih 9 ima " + j);

	}

}
