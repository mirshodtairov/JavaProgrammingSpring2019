package CoddingBat;

public class maxTriple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	public int maxTriple(int[] nums) {
		  int arr= nums[0];
		  for (int i=0; i<nums.length; i++){
		    if (nums[i]>arr){
		      return arr;
		    }
		  }
		return arr;
		}
	


}
