package day8;

import java.util.Scanner;

public class greadCheck {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("whats os your grade");
		char grade = scan.next().charAt(0);

		if (grade == 'A') {
			System.out.println("Exelent Job");
		} else {
			System.out.println("your  grade" + grade + "is not good");
			System.out.println("How many points you missed for 'A'?");
			int points = scan.nextInt();
			System.out.println("you could earn " + points + " more point if you study hard");

		}
	}

}
