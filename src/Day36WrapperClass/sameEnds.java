package Day36WrapperClass;

public class sameEnds {

	public static void main(String[] args) {
		int nums[] = { 4, 2, 4, 5 };
		int len = 1;

		for (int i = 0; i < nums.length; i++) {
			if (nums[0] == nums[nums.length - len]) {
				System.out.println(true);

			}

		}System.out.println(false);

	}

}
