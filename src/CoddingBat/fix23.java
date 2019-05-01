package CoddingBat;

import java.util.Arrays;

public class fix23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a []= {4,5,2,3,6};
		System.out.println(Arrays.toString(fix23(a)));

	}
	public static int[] fix23(int[] nums) {
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i]==2 && nums[i+1]==3 ) {
				nums[i+1]=0;
				
			}
		}
		return nums;
		  
	}

	

}
