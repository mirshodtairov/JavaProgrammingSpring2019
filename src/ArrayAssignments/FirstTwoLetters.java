package ArrayAssignments;

import java.util.Scanner;

public class FirstTwoLetters {

	public static void main(String[] args) {
		 String a="";
	    Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	    for (String str : words)
	    	a+=(str.substring(0,1)+str.substring(str.length()-1)+", ");
	    System.out.println("["+a.substring(0, a.length()-2)+"]");
	    

	}

}
