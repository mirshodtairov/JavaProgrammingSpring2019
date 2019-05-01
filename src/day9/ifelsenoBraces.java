package day9;

import java.util.Scanner;

public class ifelsenoBraces {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("what's today?: ");
		String day = scan.nextLine();
		
		
	if(day.equalsIgnoreCase("Tuesday")) 
			System.out.println("today is "+day);
	else    System.out.println("today is not "+day);
	
	}

	}

