package homeWork;

import java.util.Scanner;

public class romanNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your roman word");
		String romanNumber = scan.next();
	
		
		
		String end=(romanNumber.substring(romanNumber.length()-2));
		String begin=(romanNumber.substring(0,romanNumber.length()-2));
		String finalWord= end+begin;
		System.out.println(finalWord);
		
		

	}

}
