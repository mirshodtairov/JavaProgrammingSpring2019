package CoddingBat;

public class tripleUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean tripleUp(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]-nums[i+1]==(-1) && nums[i]-nums[i+2]==(-2)) {
				return true;
			}
		}
		return false;
		  
	}
	
	

}
