package CustomMethod;

import java.util.Scanner;

public class getThelargest {

	public static void main(String[] args) {
		System.out.println(returnTheLargest(323, 323));
		int mynum = returnTheLargest(45, 565);
		System.out.println(mynum);
		int max = maxOutOfthree(65, 43, 84);
		System.out.println(max);
		Scanner scan= new Scanner(System.in);
		String day=scan.next();
		
		
		
		boolean valid=isValidWeekDay(day);
		System.out.println(valid);
		
		
		
		
		

	}

	public static int returnTheLargest(int num1, int num2) {
		int largest;
		if (num1 > num2) {
			largest = num1;

		} else {
			largest = num2;

		}
		return largest;
	}

	public static int maxOutOfthree(int n1, int n2, int n3) {

		if (n1 >= n2 && n1 >= n3) {
			return n1;
		} else if (n2 >= n1 && n2 >= n3) {
			return n2;
		} else {
			return n3;
		}

	}

	public static boolean isValidWeekDay(String day) {
		day = day.toLowerCase().trim();
		// #1
		if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday")
				|| day.equals("friday") || day.equals("saturday") || day.equals("sanday")) {
			return true;
		} else {
			return false;

		}

		// #2
//		if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday")
//				|| day.equals("friday") || day.equals("saturday") || day.equals("sanday")) {
//			return true;
//		}
//			return false;
		
		//#3
//		return (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday")
//				|| day.equals("friday") || day.equals("saturday") || day.equals("sanday"));

	}

}