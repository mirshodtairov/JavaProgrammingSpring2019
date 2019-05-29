package CoddingBatArrays2;

import java.util.Arrays;

public class fizzArray3 {

	public static void main(String[] args) {
		int start = 5;
		int end = 11;

		int[] aaa = new int[end - start];
		for (int i = 0; i<aaa.length; i++) {
			aaa[i]=start++;
			

		}
		System.out.println(Arrays.toString(aaa));

	}

}
