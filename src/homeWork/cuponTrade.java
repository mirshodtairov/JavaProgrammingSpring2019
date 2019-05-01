package homeWork;

import java.util.Scanner;

public class cuponTrade {
         
	    public static void main(String[] args) {
	    	int Cnadies ,GumBalls;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of coupons:");
		int coupons = scan.nextInt();
		
		
		if (coupons>13) {
			Cnadies = coupons/10;
			coupons = coupons%10;
			 GumBalls = coupons/3;
			
			
		System.out.println("Number of Candies: "+Cnadies);
		System.out.println("Number of Gumballs: "+GumBalls);}
		else if(coupons<13) 
		{System.out.println("Not enough coupons");}
	    }
		}
		



