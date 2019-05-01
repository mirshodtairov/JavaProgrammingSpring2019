package RplIt;

import java.util.Scanner;

public class timeConverer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		timeConversion(scan.nextLine());

	}

	public static void timeConversion(String s) {
		int hours = 0;
		if (s.contains("AM")) {
			System.out.println(s.substring(0, s.length() - 2));
		} else {
			hours=Integer.parseInt(s.substring(0,2));
			hours+=12;
			System.out.println(hours+s.substring(2, s.length()-2));
		}

	}

}
