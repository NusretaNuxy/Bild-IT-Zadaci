package zadaci_18_01_2016;

/*
 * 
 * Napisati metodu koja printa 100 nasumiènih uppercase karaktera i 100 nasumiènih brojeva, 
 * 10 po liniji.
 */

public class cetvrti {
	// kreiraj metod
	public static void nasumicno() {
		int br = 0;// deklariši brojaè za redove
		for (int i = 0; i < 100; i++) {// kreiraj petlju za po 100 slucajnih
										// karaktera
			int slucajanKarakter = 65 + (int) (Math.random() * (90 - 65) + 1); // generisi
																				// slucaj
																				// broj
																				// iz
																				// raspona
																				// (65-9),sto
																				// odgovara
																				// decimalnom
																				// zapisu
																				// velikih
																				// slova
																				// u
																				// ASCII
																				// kodu

			int slucajanBroj = (int) (Math.random() * 101);// generisi slucajan
															// cijeli broj u
															// rangu od 0 do 100
			System.out
					.print((char) slucajanKarakter + " " + slucajanBroj + " ");// ispisi
																				// jedan
																				// karakter
																				// pa
																				// jedan
																				// cijeli
																				// broj
			br++;// povecaj brojac
			if (br == 5) {// kada brojac dostigne 5 izvrsi sledeci kod
				System.out.println();// predji u novi red
				br = 0;// brojac postavi na nulu
			}
		}

	}

	public static void main(String[] args) {
		// pozovi metodu
		nasumicno();

	}

}
