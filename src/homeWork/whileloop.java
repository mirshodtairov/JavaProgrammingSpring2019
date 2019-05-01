package homeWork;

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
//	int apple=1;
//	while(apple <=10) {
//		System.out.println("we still have apples");
//		apple++;
//	}
//	System.out.println("we have no more apples");

		int count, number;
		{
			System.out.println("enter the count: ");
			Scanner scan = new Scanner(System.in);
			number = scan.nextInt();
			count = 1;

			while (count <= number) {
				System.out.println(count + ",");
				count++;
			}
		}
	}
}
