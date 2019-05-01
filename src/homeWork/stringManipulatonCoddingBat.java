package homeWork;

import java.util.Scanner;

public class stringManipulatonCoddingBat {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		String anyword=scan.next();
		
		if (anyword.indexOf("*")-1 == anyword.indexOf("*")+1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
