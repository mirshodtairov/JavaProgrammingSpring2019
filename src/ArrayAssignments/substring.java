package ArrayAssignments;

import java.util.Scanner;

public class substring {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   for(String www:words){
	     if (www.length()>=2){
	       System.out.print(www.substring(0,2));
	     }
	   }
	}

}
