package homeWork;

import java.util.Scanner;

public class codddingBatt_trippleChar {

	public static void main(String[] args) {
		String doubleChar1;
		String doubleChar2;
		String doubleChar3;
		Scanner scan = new Scanner(System.in);
		doubleChar1 = scan.next();
		
		doubleChar1 = (doubleChar1.charAt(0)+""+doubleChar1.charAt(0)+""+doubleChar1.charAt(1)+""+doubleChar1.charAt(1));
		System.out.println(doubleChar1);
	}

}
