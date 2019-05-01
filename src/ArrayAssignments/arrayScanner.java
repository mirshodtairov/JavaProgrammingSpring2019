package ArrayAssignments;

import java.util.Scanner;

public class arrayScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("how many items in array?");
		int count = scan.nextInt();
		int [] numbers = new int[count];
		
		int nums=0;
		int total=0;
		
		
		
		//System.out.println(count);
		
		for (int i = 0; i < count; i++) {
			System.out.println("enter number");
			numbers[i]=scan.nextInt();
			
		}
		for (int p : numbers) {
			System.out.print(p+" ");
			System.out.println();
		}
		for (int k : numbers) {
			if (k>nums) {
				nums=k;
			}
			
		}
		System.out.println("the biggest number in this array is "+nums);
		
		for (int z : numbers) {
			total+=z;
			
		}
		System.out.println("total of array value is "+total);
		

	}
	

}
