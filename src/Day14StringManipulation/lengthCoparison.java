package Day14StringManipulation;

import java.util.Scanner;

public class lengthCoparison {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word1;
		String word2;
		System.out.println("enter 2 words");
		word1 = scan.next();
		word2 = scan.next();
		
		if (word1.length()>(word2.length())) {
			System.out.println(word1+" value is longer than "+word2);}
		else if (word2.length()>(word1.length())) {
			System.out.println(word2+" value is longer than "+word1);}
		else {System.out.println(word1+" equals to "+word2);
			
		}
		

	}

}
