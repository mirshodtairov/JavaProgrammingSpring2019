package ArrayAssignments;

public class doubleAndTripleIt {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i : nums) {
			System.out.print(i+", ");
			
			
		}
		System.out.println();
		
		for (int i : nums) {
			if (i % 2 == 0) {
				i *= 2;
			} else {
				i *= 3;
			}
			System.out.print(i+", ");
		}

	}

}
