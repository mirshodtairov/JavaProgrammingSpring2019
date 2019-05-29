package CoddingBat;

public class ZeroMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] zeroMax(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				for (int j = i; j < nums.length; j++) {
					if (nums[j] % 2 != 0) {
						nums[i] = nums[j];
					}
				}

			}

		}
		return nums;

	}

}
