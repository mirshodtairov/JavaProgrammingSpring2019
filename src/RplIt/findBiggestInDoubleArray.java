package RplIt;

import java.util.Arrays;

public class findBiggestInDoubleArray {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 5, 33, 9 } };
		int n = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// System.out.println(arr[i][j]);
				if (arr[i][j] > n) {
					n = arr[i][j];

				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=n;
			}

		}
		System.out.println(Arrays.deepToString(arr));

	}

}
