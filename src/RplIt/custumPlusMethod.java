package RplIt;

import java.util.Scanner;

public class custumPlusMethod {
	public static void main(String[] args) {
	      
	     
	      Scanner scan = new Scanner (System.in);
	      System.out.println("enter first number:");
	      int n1=scan.nextInt();
	      System.out.println("enter second number:");
	      int n2=scan.nextInt();
	      
	       plus(n1, n2);
	  }
	  
	    public static void plus(int num1,int num2){
	    int result = num1 + num2;
			System.out.println(result);
	     
	  
	  }
	  
	}