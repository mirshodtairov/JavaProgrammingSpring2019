package homeWork;

import java.util.Scanner;

public class GroupNember {

	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
	String group1;
	String group2;
	String group3;
	String group4;
	int sum1;
	int sum2;
	int sum3;
	int sum4;
	int totalNum;
	
	System.out.println("The name of first gruoup: ");
	group1 = scan.nextLine();
	System.out.println("The number of the first group: ");
	sum1 = scan.nextInt();
	
	System.out.println("The name of first gruoup: ");
	group2 = scan.next();
	System.out.println("The number of the first group: ");
	sum2= scan.nextInt();
	
	System.out.println("The name of first gruoup: ");
	group3 = scan.next();
	System.out.println("The number of the first group: ");
	sum3 = scan.nextInt();
	
	System.out.println("The name of first gruoup: ");
	group4 = scan.next();
	System.out.println("The number of the first group: ");
	sum4 = scan.nextInt();
	
	totalNum = sum1+sum2+sum3+sum4;
	
	System.out.println(totalNum);
	
	
	
	
	
	}	
}
