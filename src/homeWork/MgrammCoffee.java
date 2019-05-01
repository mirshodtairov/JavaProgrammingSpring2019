package homeWork;

import java.util.Scanner;

public class MgrammCoffee {

	public static void main(String[] args) {
		
		int mg;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of milligrams in drink:");
		mg = scan.nextInt();
		
		mg = 10000 / mg;
		
		System.out.println("It would take about "+mg+" drinks for a lethal overdose.");
		
	}

}
