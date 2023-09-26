import java.util.Arrays;

public class Task1_3 {
	public static void printPascalTriangle(int row) {

		for (int i = 0; i < row; i++) {
			for (int k = 0; k < row - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(pascal(i, j) + " ");
			}
			System.out.println();
		}
	}

	public static int pascal(int i, int j) {
		if (j == 0 || j == i) {
			return 1;
		} else {
			return pascal(i - 1, j - 1) + pascal(i - 1, j);
		}
	}

	public static int[] getPascalTriangle(int n) {
		int[] row = new int[n];
		Arrays.fill(row, 0);
		row[0] = 1;
		for (int i = 0; i < n; i++) {
			for (int j = i; j > 0; j--) {
				row[j] = row[j] + row[j - 1];
			}
		}
		return row;
	}

	public static int[] generateNextRow(int[] prevRow) {

		int[] nextRow = new int[prevRow.length + 1];
		nextRow[0] = 1;
		for (int i = 1; i < prevRow.length; ++i) {
			nextRow[i] = (prevRow[i-1] + prevRow[i]) % 2;
		}
		nextRow[prevRow.length] = 1;
		return nextRow;

	}

	public static void main(String[] args) {
		printPascalTriangle(10);
		System.out.println(Arrays.toString(getPascalTriangle(5)));
		System.out.println(Arrays.toString(generateNextRow(getPascalTriangle(5))));

	}
}
