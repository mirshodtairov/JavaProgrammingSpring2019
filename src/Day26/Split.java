package Day26;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		String words = "Hello,My,Name,Is,Mirshod,I,Like,Java";
		String[] arr = words.split(",");
		System.out.println("length: " + arr.length);
		System.out.println(Arrays.toString(arr));

		for (String string : arr) {
			System.out.println(string);
		}
		String diceResults = "1 - 20 of 1.461 position";
		String[] seperater = diceResults.split(" ");
		// for (String string : seperater);
		System.out.println();
		System.out.println(seperater[4]);

		String[] seperaters = diceResults.split("of");
		System.out.println(seperaters[0]);
		System.out.println(seperaters[1]);

		String www = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy";
		String[] xxx = www.split("happy");
		String[] sss = www.split("I");
		String[] aaa = www.split(" ");

		for (String string : xxx) {
			System.out.println(string);

		}
		for (String stringss : sss) {
			System.out.println(stringss);

		}
		 for (String stringaaa : aaa) {
        	 System.out.println(stringaaa);

	}
}
}
