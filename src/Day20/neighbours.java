package Day20;

import java.util.Scanner;

public class neighbours {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter word");
		String  word= scan.next();
		
		for (int i = 0; i<word.length()-1; i++) {
			
			if (word.charAt(i)==word.charAt(i+1)){
				System.out.println("beep "+word.charAt(i));
			}
					
		} 

	}

}
