package homeWork;

import java.util.Scanner;

public class stringWarmUp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String char1 = scan.next();
		String char2 = scan.next();

		if (char1.charAt(0) == ':' && char2.charAt(0) == ')') {
			System.out.println("smile");
		} else if (char1.charAt(0) == ':' && char2.charAt(0) == '(') {
			System.out.println("sad");
		} else if (char1.charAt(0) == ';' && char2.charAt(0) == ')'){
			System.out.println("smile");
		} else if(char1.charAt(0)==':' && char2.charAt(0)=='/'){
			System.out.println("upset");} 
		 else if(char1.charAt(0)==':' && char2.charAt(0)=='P') {
			System.out.println("tounge");} 
	     else { 
	    	 System.out.println("invalid character");}
	}

}
