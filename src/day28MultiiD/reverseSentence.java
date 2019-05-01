package day28MultiiD;

import java.util.Arrays;

public class reverseSentence {

	public static void main(String[] args) {
		String str = "You are very interesting person";
		String[] str2 = str.split(" ");
		String reverse="";
		System.out.println("number of words: "+str2.length);
		System.out.println(Arrays.toString(str2));
		for (String string : str2) {
			System.out.println(string);

		}
		
		for (int i = str2.length - 1; i >= 0; i--) {
			reverse+=str2[i]+" ";

			

		}System.out.println(reverse);

	}

}
