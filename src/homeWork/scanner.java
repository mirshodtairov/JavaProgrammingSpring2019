package homeWork;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("number of pennies: ");
	int numberOfPennies = scanner.nextInt();
	 
	System.out.print("number of nickles: ");
	int numberOfNickles = scanner.nextInt();
	
	System.out.print("number of dimes: ");
	int numberOfDimes = scanner.nextInt();
	
	System.out.print("number of quaters: ");
	int numberOfQuaters = scanner.nextInt();
	
	scanner.close();
	
	int totalCents = numberOfPennies +
	numberOfNickles * 5 +
	numberOfDimes * 10 +
	numberOfQuaters * 25;
	
	double dollarValue = totalCents / 100.0;
	System.out.println("total cents "+totalCents);
	System.out.println("total amount dollar "+dollarValue);
	
	 
	
	
	
	

	}

	public static int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}

}
