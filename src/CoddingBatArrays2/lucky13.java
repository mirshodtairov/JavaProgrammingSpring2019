package CoddingBatArrays2;

public class lucky13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean lucky13(int [] nums) {
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=1 || nums[i]!=3) {
				return true;
			}
			
		}
		return false;
	}

}
