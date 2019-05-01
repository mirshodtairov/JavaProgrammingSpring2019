package Day17_whileloops;

import java.util.Scanner;

public class EnterPin {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int sectretpin = 1234;
		int pincode = 0;
		
		
		while(pincode != sectretpin) {
			System.out.println("Enter pincode");
			pincode = scan.nextInt();
		}
		
		System.out.println("Access granted, select operation");

	}

}
