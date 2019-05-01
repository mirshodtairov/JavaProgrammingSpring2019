package Day34;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printWords("tomatoes", "cucumber", "eggs");
		int[] sss = { 45, 65, 68, 453, 8, 34 };
		System.out.println(sum(sss));
		int budget = 200;
		if (sum(10, 45, 110, 30) <= budget) {
			System.out.println("Within budget");
		} else {
			System.out.println("Broke");
		}
		cook("burito bowl", "rice", "salsa", "avaco toast");

	}

	public static void printWords(String... words) {
		for (String string : words) {
			System.out.println(string);
		}
	}

	public static int sum(int... nums) {
		int total = 0;
		for (int i : nums) {
			total = total + i;
		}
		return total;
	}
	
	public static void cook(String name, String... ing) {
		System.out.println(name);
		System.out.println(Arrays.toString(ing));
	}

}
