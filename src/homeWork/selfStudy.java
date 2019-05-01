package homeWork;

import java.util.Scanner;

public class selfStudy {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	double speed1;
	double speed2;
	double speed3;
	double total; 
	
	System.out.println("if the 1st car is going with the speed: ");
	speed1 = scan.nextDouble();
	
	System.out.println("if the 2nd car is going with the speed: ");
	speed2 = scan.nextDouble();
	
	System.out.println("if the 3rd car is going with the speed: ");
	speed3 = scan.nextDouble();
	
	total=speed1+speed2+speed3;
	
	System.out.println("the total speed of cars is: "+total);
	
	
	
	
	
	
	
	
	
	
	

	}

}
