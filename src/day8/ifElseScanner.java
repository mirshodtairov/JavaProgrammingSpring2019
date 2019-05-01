package day8;

import java.util.Scanner;

public class ifElseScanner {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int passingPracent = 65;
	
	System.out.println("what is your score");
	int yourScorePracent = scan.nextInt();
	
	if (yourScorePracent>65) {
	System.out.println("you pass");
	}else {System.out.println("you suck");
	
	}
	}

}
