package CoddingBat;

import java.util.Arrays;

public class reverse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n = { 32, 43, 54, 67 };
		System.out.println(Arrays.toString(reverse3(n)));

	}

	public static int[] reverse3(int[] nums) {
		int[] newarr = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			newarr[i] = nums[nums.length - 1 - i];

		}
		return newarr;

	}
}
