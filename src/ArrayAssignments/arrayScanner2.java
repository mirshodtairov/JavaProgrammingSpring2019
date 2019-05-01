package ArrayAssignments;

import java.util.Scanner;

public class arrayScanner2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] splited = str.split(" ");
		for (String string : splited) {
			System.out.println(string);
		}
		
	}

}
