package Day26;

import java.util.Arrays;

public class toCharArray {

	public static void main(String[] args) {
		String str= "java";
		char [] charsArray = str.toCharArray();
		for (char c : charsArray) {
			System.out.println(c);
		}
		System.out.println();
		
		String sss="sghag kasjdhk kadhdkjda kahsdkjh";
		String [] aaa= sss.split(" ");
		
		System.out.println(Arrays.toString(aaa));
		

	}

}
