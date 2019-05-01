package RplIt;

import java.util.Arrays;
import java.util.Scanner;

public class zombiAtack {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();

		}
		int day = 0;
		int[] arr = { 0, 0, 0, 0, 0, 0, 0, 0 };
		do {
			System.out.println("Day " + day +" " +Arrays.toString(inhabitants));

			day++;
			for (int j = 0; j < inhabitants.length; j++) {
				inhabitants[j] = inhabitants[j] / 2;
			}
		} while (!Arrays.equals(inhabitants, arr));
		System.out.println("Day " + day + Arrays.toString(inhabitants));
		System.out.println("---- EXTINCT ----");

	}
}
