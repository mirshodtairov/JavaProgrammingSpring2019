package Exceptions01;

public class TryCatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 32, 54, 5 };
		try {
			System.out.println(nums[6]);

		} catch (Exception e) {
			System.out.println(" @@@@@@   The end  @@@@@ ");
		}

		int j = 100;
		try {
			int n = j / 0;

			System.out.println(n);
		} catch (ArithmeticException e) {
			System.out.println("Can cot devide by zero ");
			e.printStackTrace();
		}

		System.out.println(" @@@@@@   The end  @@@@@ ");
		
		
		

	}
	
	

}
