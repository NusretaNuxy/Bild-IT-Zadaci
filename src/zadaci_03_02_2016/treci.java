package zadaci_03_02_2016;

/*
 * (Largest row and column) Write a program that randomly fills in 0s and 1s into 
 * a 4-by-4 matrix, prints the matrix, and finds the first row and column with the
 * most 1s. 
 */

/*
 * Napisati program koji nasumièno popunjava 4x4 matricu nulama i jedinicama, ispisuje tu matricu
 * i pronalazi prvi red i kolonu sa najviše jedinica.
 */
public class treci {

	public static void main(String[] args) {
		// kreiraj matricu 4x4 i pozovi metodu
		int[][] matrix = generateRandomMatrix(4, 4);
		// pozovi metodu za red
		int rowMax = biggestRow(matrix);
		// pozovi metodu za kolonu
		int columnMax = biggestColumn(matrix);
		// ispisi rezultat
		System.out.println("Prvi red sa najvise jedinica je : " + (rowMax + 1));
		System.out.println("Prva kolona sa najvise jedinica je : "
				+ (columnMax + 1));

	}

	// kreiraj metodu za genrisanje 0 ili 1 kao elemenata matrice
	public static int[][] generateRandomMatrix(int rowNumber, int columnNumber) {
		int[][] randomMatrix = new int[rowNumber][columnNumber];

		for (int rowIndex = 0; rowIndex < rowNumber; rowIndex++) {
			for (int columnIndex = 0; columnIndex < columnNumber; columnIndex++) {
				randomMatrix[rowIndex][columnIndex] = (int) (Math.random() * 2);
				System.out.print(randomMatrix[rowIndex][columnIndex]);
			}
			System.out.println();
		}
		return randomMatrix;
	}

	// kreiraj metodu za pronalazak prvog najveceg reda
	public static int biggestRow(int[][] matrix) {
		// kreiraj varijablu za sumu,za red i za index
		int rowSum;
		int maxRowSum = 0;
		int maxRowIndex = 0;

		for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
			rowSum = 0;

			for (int columnIndex = 0; columnIndex < matrix[0].length; columnIndex++) {
				// saberi elemente svakog reda
				rowSum += matrix[rowIndex][columnIndex];
			}
			// ispitaj koji red ima najvecu sumu
			if (rowSum > maxRowSum) {
				maxRowSum = rowSum;
				maxRowIndex = rowIndex;
			}
		}
		// vrati rezultat
		return maxRowIndex;
	}

	// kreiraj metodu za pronalazak prve najvece kolone - identicno kao i za
	// redove sto smo radili,samo sto sada sabiramo po koloni
	public static int biggestColumn(int[][] matrix) {
		int columnSum;
		int maxSum = 0;
		int maxColumnIndex = 0;

		for (int columnIndex = 0; columnIndex < matrix[0].length; columnIndex++) {
			columnSum = 0;
			for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
				columnSum += matrix[rowIndex][columnIndex];
			}
			if (columnSum > maxSum) {
				maxSum = columnSum;
				maxColumnIndex = columnIndex;
			}
		}
		return maxColumnIndex;
	}
}
