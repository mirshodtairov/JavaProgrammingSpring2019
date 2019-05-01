package Day34;

import java.util.Arrays;

public class GetUniteV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,0,5,6,7,2,3,4,5,1};
		int[] cheapUnique = getUniqueArrayV2(arr);
		System.out.println(Arrays.toString(cheapUnique));

	}

	public static int[] getUniqueArrayV2(int[] nums) {
		// find out how many unique numbers
		String uniq = "";
		for (int i = 0; i < nums.length; i++) {// outer loop

			int temp = nums[i]; // get a number
			int counter = 0;
			//
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == temp && i != j) {
					counter++;
					break;
				}
			}
			if (counter == 0) {
				uniq += temp;
			}

		}
		String[] arr = uniq.trim().split(" ");
		int[] uInt = new int[arr.length];
		for (int k = 0; k < arr.length; k++) {
			uInt[k] = Integer.parseInt(arr[k]);

		}
		return uInt;
	}
}
