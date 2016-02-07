package zadaci_05_02_2016;

import java.util.Scanner;

/*
 * Write a test program that prompts the user to enter values for a, b, and c and displays 
 * the result based on the discriminant. If the discriminant is positive, display the two 
 * roots. If the discriminant is 0, display the one root. Otherwise, display “The equation 
 * has no roots.” See Programming Exercise 3.1 for sample runs.
 */

public class test_drugi {
	

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite evrijednost varijable a:");
		double a = ulaz.nextDouble();

		System.out.println("Unesite evrijednost varijable b:");
		double b = ulaz.nextDouble();

		System.out.println("Unesite evrijednost varijable b:");
		double c = ulaz.nextDouble();

		QuadraticEquation r1 = new QuadraticEquation(a, b, c);

		if (o.QuadraticEquation() > 0) {
			System.out.printf("1.roots: ", o.getRoot1(), o.getRoot2());
		} else {
			System.out.println("Jednacina nema korijena");
		}

	
	}
}
