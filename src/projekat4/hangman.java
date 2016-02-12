package projekat4;

import java.util.Scanner;

public class hangman {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite recenicu:");

		String recenica = ulaz.nextLine();

		char[] recNiz = recenica.toCharArray();
		char[] recenica1 = recenica.toCharArray();
		char[] recenica2 = recenica.toCharArray();

		for (int i = 0; i < recenica2.length; i++) {
			if (recenica2[i] != ' ') {
				recenica2[i] = '_';
			}

		}
		char odgovor;
		int brojPokusaja = 30;
		while (brojPokusaja > 0) {
			brojPokusaja--;
			odgovor = ulaz.next().charAt(0);

			for (int i = 0; i < recenica.length(); i++) {
				if (odgovor == recenica1[i]) {
					recenica2[i] = recenica1[i];

				}
				System.out.print(recenica2[i]);
			}
			System.out.println();

		}

	}
}
