package RplIt;

import java.util.*;

public class combineTwoArraysInArrayList {

	public static void main(String[] args) {
		String [] n = {"1", "2", "3"};
		String [] n2 = {"41", "52", "73"};
		
		System.out.println(combineRs(n, n2));

	}

	public static String combineRs(String[] r1, String[] r2) {

		ArrayList<String> str = new ArrayList<>();
		String ww="";

		for (int i = 0; i < r1.length; i++) {
			str.add(r1[i]);

		}
		for (int i = 0; i < r2.length; i++) {
			str.add(r2[i]);
		}
		for (String aaa : str) {
			ww+=aaa;
			
		}
		
		
		return ww;

	}

}
