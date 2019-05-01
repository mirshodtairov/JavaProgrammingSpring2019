import java.util.Scanner;

public class vendingMachine {

	public static void main(String[] args) {
		 int itemPrice;
		 int changePrice;
		 int quarters, dimes, nickels;
		 Scanner object =  new Scanner(System.in);
		 System.out.println("Enter price in cents: ");
		 itemPrice = object.nextInt();
		
	
		
		 if (itemPrice<25||itemPrice>100){
			 System.out.println("Invalid price!");}
		 
		 if (itemPrice%5!=0) {System.out.println("Invalid price!");}
		 
		 
		 changePrice=100-itemPrice;
	     quarters = changePrice/25;
	     changePrice = changePrice%25;
	     dimes = changePrice/10;
	     changePrice = changePrice%10;
	     nickels = changePrice/5;
	     
	     System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, "+nickels+" nickels.");
	} 
	  
		
	}


