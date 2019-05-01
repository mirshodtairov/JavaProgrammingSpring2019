package MuradilReview;

public class CheckIfInArray {

	public static void main(String[] args) {
		int n = 55;
		int nums[] = { 22, 33, 44, 5, 66, 77 };

		boolean present = false;
		for (int i : nums) {
			if (i==n) {
				present=true;
				break;
			}
			

		}
		System.out.println("is 55 is present?"+present);

	}

}
