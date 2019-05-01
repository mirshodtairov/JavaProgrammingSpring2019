package homeWork;

import java.util.Scanner;

public class LastChar {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 String word = scan.next();
		 char lastchar = word.charAt( word.length()-1 );
		 System.out.println(lastchar);
		  }
		
	}
