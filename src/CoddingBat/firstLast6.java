package CoddingBat;

public class firstLast6 {
	public static void main(String[] args) {
	
		
		int arr[] = {6, 1, 2, 3};
		System.out.println(firstLast6(arr));
		
	}
	public static boolean firstLast6(int[] nums) {
		
			if (nums[0]== 6 || nums[nums.length-1] == 6) {
				return true;
			}
			
		
		return false;
		  
	}
	
	

}
