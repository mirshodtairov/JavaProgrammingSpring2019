package homeWork;

import java.util.Scanner;

public class findJava {

	public static void main(String[] args) {
		boolean exists = false;
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		if(word.length() < 4) {
			System.out.println("Invalid word");
			return;
		}
		
		if (word.startsWith("java") || (word.substring(1, 5).equals("java"))){
			exists = true;
			// return;
		}
		System.out.println(exists);
	}

}
