package Day19;

import java.util.Scanner;

public class doWhileMyWork {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
//		{System.out.println("enter ther name");
//		String name=scan.next();
		String name;
		do {
		System.out.println("enter ther name");
		 name=scan.next();
		}
		while (name.charAt(0)!=(name.charAt(1)));
		System.out.println("match");
		

	}

	}

