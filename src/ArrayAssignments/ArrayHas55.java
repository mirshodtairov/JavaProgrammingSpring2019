package ArrayAssignments;

import java.util.Scanner;

public class ArrayHas55 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int count = 0;

		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() };
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 5 && nums[i + 1] == 5) {
				count++;
				if (count >= 1)

					System.out.print(true);
				return;

			}

		}
		System.out.println(false);
	}
}
