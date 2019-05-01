package ArrayAssignments;

import java.util.Arrays;

public class ArraysSortWithChar {

	public static void main(String[] args) {
		char [] ch= {'a', 'C', 'd', 'A' , 'B', '1', 'Z', 'w', '4', 'u', 'K', '5'};
		
		Arrays.sort(ch);
		
		
		
		for (char c : ch) {
			System.out.print(c+",");
		}
		
		System.out.println();
		boolean[] YesOrNO= {true ,false};
		for (boolean b : YesOrNO) {
			System.out.println(b);
		}
		

	}

}
