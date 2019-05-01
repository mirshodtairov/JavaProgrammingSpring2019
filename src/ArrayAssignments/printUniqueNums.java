package ArrayAssignments;

public class printUniqueNums {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 3, 4, 4, 5, 523, 23, 34, 34, 77, 7, 56, 78, 78, 5 };
		
		for (int outer = 0; outer < nums.length; outer++) {
			int current = nums[outer];
			boolean duplicate = false;
			for (int inner = 0; inner < nums.length; inner++) {
				if (nums[inner] == current && outer != inner) {
					duplicate = true;
					break;

				}

			}
			if (duplicate==false) {
				System.out.println(current);
			}

		}

	}

}
