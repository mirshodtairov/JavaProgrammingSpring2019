package homeWork;

import java.util.Scanner;

public class userNameMatching {

	public static void main(String[] args) {

		
		String Name3;

		System.out.println("Enter full name:");
		Scanner scan = new Scanner(System.in);
		Name3 = scan.next();
		if (Name3.equalsIgnoreCase("Max Payne") || (Name3.equalsIgnoreCase("Alan Wake"))){
			System.out.println("User found!");}
		 else {System.out.println("User not found!");}
//
//		switch (Name3) {
//		case Name:
//			System.out.println("User found!");
//			break;
//		case "Alan Wake":
//			System.out.println("User found!");
//			break;
//		default:
//			System.out.println("User not score");
//			break;

		

	}

}