package projekat2;

public class craps {

	public static void main(String[] args) {
		// kreiraj pomocne varijable
		int pom = 12;
		int pomocna = 0;
		// generisi prvi broj
		int a = 1 + (int) (Math.random() * 11);
		// generisi drugi broj koji kad se sabere sa prvim ne smije biti veci od 12
		int x = pom - a;
		int b = 1 + (int) (Math.random() * x);
		// izracunaj sumu
		int sum = a + b;
		// ispisi brojeve
		System.out.println(a + " " + b);
		// ispitaj uslov,ako je suma jednaka 2 ili 3 ili 12 ispisi izgubljeno
		if ((sum == 2) || (sum == 3) || (sum == 12)) {
			System.out.println("You lose!");
			// ako je suma jednaka 7 ili 11 ispisi pobjeda
		} else if ((sum == 7) || (sum == 11)) {
			System.out.println("You win!");

			// u suprotnom ako suma nije jednaka ni jednom od prethodnih uslova
			// izvrsi tijelo do-while petlje
		} else if ((sum != 2) || (sum != 3) || (sum != 12) || (sum != 7)
				|| (sum != 11)) {

			do {
				// ispisi point
				System.out.println("Point is " + sum);
				// pomocnoj varijabli dodijeli vrijednost sume
				pomocna = sum;
				// ponovo generisi brojeve
				a = 1 + (int) (Math.random() * 11);
				x = pom - a;
				b = 1 + (int) (Math.random() * x);
				// ispisi brojeve i racunaj sumu
				System.out.println(a + " " + b);
				sum = a + b;
				// ako je suma jednaka pomocnoj varijabli tj.sumi prethodnih
				// brojeva ispisi pobjedu i zavrsi program
				if (sum == pomocna) {
					System.out.println("You win!");
					break;
					// ako je suma jednaka 7 ispisi "you lose" i zavrsi program
				} else if (sum == 7) {
					System.out.println("You lose!");
					break;
				} else {
					pomocna = 0;
				}

			} while ((sum != 7) || (sum != pomocna));

		}
	}
}
