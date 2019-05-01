package RplIt;

import java.util.Scanner;

public class BiggestIntIn2DArray {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int rows = inp.nextInt(), cols = inp.nextInt();
		int[][] arr = new int[rows][cols];
		int count = 0;
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= cols - 1; j++) {
				arr[i][j] = inp.nextInt();
				if (arr[i][j] > count) {
					count = arr[i][j];
				}
			}
			System.out.println(count);

		}

	}

}
