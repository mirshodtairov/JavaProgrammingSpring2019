package homeWork;

import java.util.Scanner;

public class afterClassWork {
public static void main(String [] args) {
	
	Scanner scan = new Scanner(System.in);

	String name1;
	String name2;
	String name3;
	int TotalPrice;
	int price;
	int price1;
	int price2;
	
	
	System.out.println("the item name: ");
	name1 = scan.next();
	price = scan.nextInt();
	
	System.out.println("the item name2: ");
	name2 = scan.next();
	price1 = scan.nextInt();

	System.out.println("the item name3: ");
	name3 = scan.next();
	price2 = scan.nextInt();
	
	TotalPrice = price+price1+price2;
	 
	System.out.println("Total: "+TotalPrice);
	
	


	

	
	
	
}
}
