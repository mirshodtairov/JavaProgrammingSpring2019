package Day31CustomMethodsPractice;

import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		countUp(1);
		
		countDown(3);
		
		countDownChar('t');
		Scanner scan =new Scanner(System.in);
		System.out.println("enter number");
		int iputnum=scan.nextInt();
		countDown(iputnum);
	}

	public static void countUp(int num) {

		if (num <= 1) {
			System.out.println("Invalid Number");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.println(i);
			}

		}

	}

	public static void countDown(int num2) {
		for (int z = num2; z > 0; z--) {
			System.out.println(z);

		}
	}

	public static void countDownChar(char charr) {
		for (int h = charr; h >0; h--) {
			System.out.println(h);
		}

	}
}
