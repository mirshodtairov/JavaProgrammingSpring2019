package RplIt;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isPalindrome(1001);
	}

	public static void isPalindrome(int num) {
		int result = 0;
		int remainder;
		int num1=num;
		while (num > 0) {
			remainder = num % 10;
			num = num / 10;
			result = result * 10 + remainder;
		}
		if (result == num1) {
			System.out.println(true);
			return;
		}
		System.out.println(false);
	

	}

}
