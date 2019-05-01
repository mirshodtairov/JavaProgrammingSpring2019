package Day16StingManipulation;

import java.util.Scanner;

public class replace {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("type word:");
		
		String word = scan.next();
		System.out.println(word.replace("a", "y"));
		
		System.out.println(word.replace("sad", "happy"));
		

	}

}
