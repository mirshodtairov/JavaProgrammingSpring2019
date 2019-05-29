package CoddingBat;

import java.util.Arrays;

public class tenRun {

	public static void main(String[] args) {

		int[] check = { 0, 2, 10, 5, 3, 23, 20, 33 };
		System.out.println(Arrays.toString(tenRun(check)));
	

	}

	public static int[] tenRun(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 10 == 0)
				while (i < nums.length - 1 && nums[i + 1] % 10 != 0) {
					nums[i + 1] = nums[i];
					i++;
				}
		}
		return nums;
	}
}