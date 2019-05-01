package April6;

import java.util.Random;
import java.util.Scanner;

public class largeArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random =new Random();
		
		System.out.println("how many numbers in array");
		int count = scan.nextInt();
		
		int [] nums = new int[count];
		for (int i = 0; i < count; i++) {
			nums[i]=random.nextInt(1000);
		}
		for (int p : nums) {
			System.out.print(p+", ");
			
		}

	}

}
