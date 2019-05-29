package CoddingBat;

import java.util.Arrays;

public class sum28 {

	public static void main(String[] args) {
		int num[]= {43,5,2,6,2,5,2};
		System.out.println(sum28(num));

	}public static boolean sum28(int[] nums) {
		 int counter=0;
		  for(int i = 0; i<nums.length; i++){
		    if(nums[i]==2){
		      counter++;
		    }
		  }
		  if (counter==4){
		    return true;
		  }
		  return false;
		}


}
