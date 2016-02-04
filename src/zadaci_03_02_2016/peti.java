package zadaci_03_02_2016;

/*
 * (Even number of 1s) Write a program that generates a 6-by-6 two-dimensional
 * matrix filled with 0s and 1s, displays the matrix, and checks if every row and 
 * every column have an even number of 1s.
 */

public class peti {
	// kreiraj metodu za genrisanje 0 ili 1 kao elemenata matrice
	public static int[][] generateRandomMatrix(int rowNumber, int columnNumber) {
		int[][] randomMatrix = new int[rowNumber][columnNumber];

		for (int rowIndex = 0; rowIndex < rowNumber; rowIndex++) {
			for (int columnIndex = 0; columnIndex < columnNumber; columnIndex++) {
				randomMatrix[rowIndex][columnIndex] = (int) (Math.random() * 2);

			}

		}
		return randomMatrix;
	}

	// kreiraj metodu za provjeru da li red ima paran broj 1
	public static boolean red(int[][] m, int r) {
		// kreiraj brojac
		int br = 0;
		// prodji kroz red matrice
		for (int j = 0; j < m[r].length; j++) {
			if (m[r][j] == 1)
				// ako je element reda jednak 1 povecaj brojac
				br++;
		}
		// ako je brojac djeljiv sa 2 i razlicit od 0 vrati true
		if (br % 2 == 0 && br != 0) {
			return true;
		} else
			return false;
	}

	// kreiaj metodu za provjeru da li kolona ima paran broj 1
	public static boolean kolona(int[][] m, int k) {
		// kreiraj brojac
		int br = 0;
		// prodji kroz kolonu matrice
		for (int i = 0; i < m.length; i++) {
			if (m[i][k] == 1)
				// ako je element kolona jednak 1 povecaj brojac
				br++;
		}
		// ako je uslov tacan vrati true
		if (br % 2 == 0 && br != 0) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		// kreiraj matricu 4x4 i pozovi metodu
		int[][] matrix = generateRandomMatrix(6, 6);
		// ispisi matricu
		System.out.println("Generisana je slijedeca matrica: ");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		// ispisi rezultat za red i pozovi metodu
		for (int i = 0; i < matrix.length; i++) {
			if (red(matrix, i) == true) {
				System.out.println("Red " + (i + 1) + " nema paran broj 1");
			} else {
				System.out.println("Red " + (i + 1) + " ima paran broj 1");
			}
		}
		// ispisi rezultat za kolonu i pozovi metodu
		for (int j = 0; j < matrix[0].length; j++) {
			if (kolona(matrix, j) == true) {
				System.out.println("kolona " + (j + 1) + " ima paran broj 1");
			} else {
				System.out.println("kolona " + (j + 1) + " nema paran broj 1");
			}
		}

	}

}
