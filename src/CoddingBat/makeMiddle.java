package CoddingBat;

import java.util.Arrays;

public class makeMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] argss = {1,2,3,4};
		System.out.println(Arrays.toString(makeMiddle(argss)));

	}
	public static int[] makeMiddle(int[] nums) {
		int [] arr = new int [2];
		arr[0]= nums[nums.length/2-1];
		arr[1]= nums[ nums.length/2];
		return arr;
		
		  
	}


}
