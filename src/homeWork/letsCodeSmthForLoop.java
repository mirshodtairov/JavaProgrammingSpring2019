package homeWork;

import java.util.Scanner;

public class letsCodeSmthForLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word;
		word = scan.next();
		char letter = 'a';
		

		for (int i = 0; i < word.length(); i++) {
			
			if (word.charAt(i) == (letter)) {
				System.out.println("a is matching");
				return;

			}else {System.out.println("no");
			return;
			
		}

	}

}
}