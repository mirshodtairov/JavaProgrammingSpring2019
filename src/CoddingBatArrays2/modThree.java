package CoddingBatArrays2;

public class modThree {

	public static void main(String[] args) {
		int[] nums = {9, 7, 7, 2, 2 };
		int counter = 0;
		int counter1 = 0;

		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] % 2 == 0 || nums[i+1]== 0) {
				counter++;
				i++;
				
			}
			if (nums[i] % 2 != 0 || nums[i+1] % 2 != 0) {
				counter1++;
				i++;

			}
		}
		if (counter>=3 || counter1 >=3) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

	}

}
