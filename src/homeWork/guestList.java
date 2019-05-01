package homeWork;

import java.util.Scanner;

public class guestList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter guest name:");
		String name = input.next();
		System.out.println("Do you want to enter new guest name:");
		String answer = input.next();
		while (answer.equalsIgnoreCase("yes")) {
			System.out.println("Please enter guest name:");
			String  name1 = input.next();
			name=name+","+name1;
			
			System.out.println("Do you want to enter new guest name:");
		answer = input.next();
			
		}
		System.out.println("Guest's list: "+name);

	}

}
