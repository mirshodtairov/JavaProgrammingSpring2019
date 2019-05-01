package Day19;

import java.util.Scanner;

public class ZombiAtack {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int days = 0;
		int inhabitants;
		System.out.println("enter the number of inhabitance");
		inhabitants = scan.nextInt();

		while (inhabitants > 0) {
			System.out.println(inhabitants);
			inhabitants = inhabitants / 2;
			days++;

		}
		System.out.println("Extinct");
	}

}
