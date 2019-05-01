package homeWork;

import java.util.Scanner;

public class stringManoipulation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the name:");
		String n=scan.next();
		
		while (n.charAt(0)!=(n.charAt(1))){
			System.out.println("first and second letters  != enter another name");
			n=scan.next();
			}
		System.out.println("it matches");
		
		
		
	}

}