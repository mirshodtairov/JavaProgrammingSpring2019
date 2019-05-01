package day8;

import java.util.Scanner;

public class votingEligibility {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int votingage = 18;
    int yourage;
    
    System.out.println("if your age: ");
    yourage = scan.nextInt();
    
    if (yourage>=votingage) {
    	System.out.println("you are voting");
    }else{System.out.println("you still have "+(votingage-yourage)+" years to wait");
    
	}

}
}