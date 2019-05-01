package RplIt;

import java.util.Arrays;

public class Zombi2 {

	public static void main(String[] args) {

		int[] inhabitants = { 3, 6, 0, 4, 3, 3, 7, 0 };

		int[] zero = new int[inhabitants.length];
		int counter=0;
		do {
			System.out.println("Day "+counter+++" "+Arrays.toString(inhabitants));

			for (int i = 0; i < inhabitants.length - 1; i++) {
				if (inhabitants[i] == 0 && inhabitants[i + 1] != 0) {
					inhabitants[i + 1] = inhabitants[i + 1] / 2;
					i++;
				} else if (inhabitants[i] != 0 && inhabitants[i + 1] == 0) {
					inhabitants[i] = inhabitants[i] / 2;

				}

			}
		} while (!Arrays.equals(inhabitants, zero));
		System.out.println("Day "+counter+++" "+Arrays.toString(inhabitants));
		System.out.println("---- EXTINCT ----");

	}
}