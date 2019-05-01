package RplIt;

public class reversingNums {

	public static void main(String[] args) {
		
		int result = 0;
		int remainder;
		int num = 1221;
		int num2=num;
		while (num > 0) {
			remainder = num % 10;
			result = result * 10 + remainder;
			num = num / 10;
			

		}
		System.out.println(result);
		
		if(result==num2) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		

	}
}
