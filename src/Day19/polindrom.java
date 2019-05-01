package Day19;

import java.util.Scanner;

public class polindrom {

	public static void main(String[] args) {
		String word;
		String reverce = "";
		Scanner scan= new Scanner(System.in);
		word = scan.next();

		int indx = word.length() - 1;
		while (indx >= 0) {
			reverce = reverce + word.charAt(indx);
			indx--;

		}
		System.out.println(reverce);
		if (reverce.equalsIgnoreCase(word)) {
			System.out.println("it is polindrome");}
			else {System.out.println("it is not");}
			
		}

	}

