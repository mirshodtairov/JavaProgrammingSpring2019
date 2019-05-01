package CustomMethod;

import java.util.Scanner;

public class printNext3 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("enter number");
		int num = inp.nextInt();
		next3(num);

	}

	public static void next3(int num) {
		for (int i = num+1; i < num + 4; i++) {
			if (num > 0) {

				System.out.println(i);
			}

		}
	}

}
