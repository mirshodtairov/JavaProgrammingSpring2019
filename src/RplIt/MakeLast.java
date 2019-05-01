package RplIt;

import java.util.Arrays;

public class MakeLast {

	public static void main(String[] args) {
		int[] nums = { 23, 5, 4, 6, 3 };

		int[] num = new int[nums.length * 2];

		num[num.length - 1] = nums[nums.length - 1];
		System.out.println(Arrays.toString(num));

	}

}
