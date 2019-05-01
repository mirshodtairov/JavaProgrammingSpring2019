package day9;

import java.util.Scanner;

public class canadaCapital {

	public static void main(String[] args) {
		
		System.out.println("what is the capital of Cnada?");
		Scanner scan = new Scanner(System.in);
		String capital = scan.next();
		
		if (capital.equals("ottawa")){  
	 //(capital=="ottaw") wont work
	 //if (capital.equalsIgnoreCase("ottawa"))
     // it is going to ignore all of the case difference 
		System.out.println("tour answer is correct!");
	   }else{
		   System.out.println("your answer is not correct "+capital+" is not a capital of canada");
	   } 
		   
	}

}
