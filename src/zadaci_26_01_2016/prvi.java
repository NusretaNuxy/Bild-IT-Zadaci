package zadaci_26_01_2016;

/*
 *  Pretpostavimo da se registarska tablica za auto sastoji od tri uppercase karaktera i 4 
 *  broja u sljedeæem formatu AAA-1234. Napisati program koji nasumièno generiše tablicu.
 */
public class prvi {
	// kreiraj metodu koja vraca char
	public static char slovo() {
		// generisi slucajan broj
		int karakter = 65 + (int) (Math.random() * (90 - 65) + 1);
		// vrati karakter generisanog broja iz ASCII koda
		return (char) (karakter);
	}

	// kreiraj metodu za vracanje slucajnog broja od 1 do 9
	public static int broj() {
		// generisi slucajan broj
		int Broj = 1 + (int) (Math.random() * 9);
		return Broj;
	}

	// ispisi rezultat i pozovi metode
	public static void main(String[] args) {
		System.out.println("registracijska tablica broj:");
		System.out.print(slovo() + "" + slovo() + "" + slovo() + "-" + broj()
				+ "" + broj() + "" + broj() + "" + broj());

	}

}
