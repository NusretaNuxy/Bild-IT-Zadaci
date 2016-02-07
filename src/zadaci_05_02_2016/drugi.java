package zadaci_05_02_2016;

//9,10.zadatak

public class drugi {
	// Design a class named QuadraticEquation fo a quadratic equation ax2+ bx +
	// x = 0.
	public class QuadraticEquation {
		// Private data fields a, b, and c that represent three coefficients.
		private double a, b, c;

		// A constructor for the arguments for a, b, and c.
		public QuadraticEquation(double a, double b, double c) {
			super();
			this.a = a;
			this.b = b;
			this.c = c;
		}

		// Three getter methods for a, b, and c.
		public double getA() {
			return a;
		}

		public double getB() {
			return b;
		}

		public double getC() {
			return c;
		}

		// A method named getDiscriminant() that returns the discriminant, which
		// is b2- 4ac.
		public double getDiscriminant() {
			return (Math.pow(b, 2) - 4 * a * c);
		}

		// The methods named getRoot1() and getRoot2() for returning two roots
		// of the equation.
		// These methods are useful only if the discriminant is nonnegative. Let
		// these meth-ods return 0 if the discriminant is negative.

		public double getRoot1() {
			if (getDiscriminant() > 0) {
				double pom = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
				return ((-b) + pom) / (2 * a);
			} else {
				return 0;
			}
		}

		public double getRoot2() {
			if (getDiscriminant() > 0) {
				double pom = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
				return ((-b) - pom) / (2 * a);
			} else {
				return 0;
			}
		}

	}

}
