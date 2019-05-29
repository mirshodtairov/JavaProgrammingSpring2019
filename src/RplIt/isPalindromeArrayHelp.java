package RplIt;

import java.util.*;
import java.util.Arrays;

public class isPalindromeArrayHelp {

	public static void main(String[] args) {
		String sss = "Cytivic";
		System.out.println(isPalindrome(sss));

	}

	public static boolean isPalindrome(String check) {

		String[] str = check.split(" ");
		String proba = "";
		String reverse = "";
		for (int i = 0; i < str.length; i++) {
			proba += str[i];

		}

		for (int i = proba.length() - 1; i >= 0; i--) {

			reverse += proba.charAt(i);

		}
		reverse = reverse.toLowerCase();
//		check = check.toLowerCase();
		if (reverse.equals(proba.toLowerCase())) {
			return true;
		}
		return false;

	}
	

}
