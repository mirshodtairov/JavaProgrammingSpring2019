package ArrayAssignments;

import java.util.Scanner;

public class substrungOfArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i=0;i<5;i++)
		{
			arr[i] = input.nextLine();
		System.out.println(arr[i].substring(0, 3));
		}
		

	}

}
