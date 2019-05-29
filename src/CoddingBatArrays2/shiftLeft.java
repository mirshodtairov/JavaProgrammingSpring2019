package CoddingBatArrays2;

import java.util.Arrays;

public class shiftLeft {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] nums= {2,3,4,5};
//		int[] b = Arrays.copyOf(nums, nums.length+1);
//		System.out.println(Arrays.toString(b));
//		int c=b[0];
//		b[b.length-1]=c;
//		
//		System.out.println(Arrays.toString(b));

//		int[] nums = { 1, 7, 1, 3, 6, 4 };
//
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] == 4) {
//				int[] n = new int[i];
//				for (int j = 0; j < n.length; j++) {
//
//					n[j] = nums[j];
//
//				}
//				System.out.println(Arrays.toString(n));
//			}
//			
//			
//			

	}

	public static int[] post4(int[] nums) {

		int[] t = new int[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				int[] tab = new int[i];
				for (int j = 0; j < i; j++) {
					tab[j] = nums[j];
				}
				return tab;
			}
		}
		return t;
	}

}
