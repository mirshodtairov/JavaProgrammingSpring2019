package CoddingBatArrays2;

public class unlucky13 {

	public static void main(String[] args) {
					// 0 1 2 3  4 5  6
		int [] nums = {2,3,5,13,4,66,13};
		System.out.println(sum13(nums));

	}
	public static int sum13(int[] nums) {
			int sum=0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]==13) {
				//continue;
				i++;
			} else {
				sum+=nums[i];
			}
		
			
		}
		return sum;
	}


}
