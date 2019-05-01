package MethodsWithReturn;

import java.util.Scanner;

import Day19.polindrom;

public class stringMethods {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String reveresed = scan.nextLine();

		System.out.println(reverse(reveresed));
		boolean yesOrNo=polindrome("civic");
		System.out.println(yesOrNo);

	}

	public static String reverse(String str) {
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp += str.charAt(i);
		}
		return temp;
	}

	public static boolean polindrome(String poli) {
		String temp = "";

		for (int j = poli.length() - 1; j >= 0; j--) {
			temp += poli.charAt(j);

		}
		if (temp.equalsIgnoreCase(poli)) {
			return true;
		}
		return false;

	}
}
