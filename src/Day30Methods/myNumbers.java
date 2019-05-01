package Day30Methods;

import java.util.Random;
import java.util.Scanner;

public class myNumbers {

	public static void main(String[] args) {
		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();

		pushup();

		rangePrint();

	}

	public static void showMe5Numbers() {
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.print(r.nextInt(1001) + " ");
		}
		System.out.println();

	}

	public static void pushup() {
		for (int j = 1; j < 10; j++) {
			System.out.println("Pushups-" + j);

		}
		System.out.println("time to rest");
	}

	public static void rangePrint() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 1st  number");
		int num1 = scan.nextInt();
		System.out.println("enter 2nd number");
		int num2 = scan.nextInt();
		if(num1 < num2) {
			for(int i = num1; i <= num2; i++) {
				System.out.print(i +" ");
			}
		}else if(num1 > num2) {
			for(int k = num1; k >= num2; k--) {
				System.out.print(k+" ");
			}
		}else {
			System.out.println(num1);
		}
		System.out.println();
	}
	
	
	
}






