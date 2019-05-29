package CoddingBatArrays2;

import java.util.Arrays;

public class withoutTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bbb = { 43, 6, 10, 44, 10, 67 };
		System.out.println(Arrays.toString(withoutTen(bbb)));

	}

	public static int[] withoutTen(int[] nums) {
		int counter = 0;
		int[] arr = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 10) {
				nums[i]=0;
			}
			}
				for (int j = 0; j < arr.length; j++) {
					

				}
                return nums;
			
			

		

		

	}

}
