package ArrayAssignments;

import java.util.Arrays;

public class ArraysSortString {

	public static void main(String[] args) {
		String [] names= {"Said", "Mike", "Alysia", "Tarik", "Halili"};
		
		Arrays.sort(names);
		for (String string : names) {
			System.out.print(string+" ");
			
		}

	}

}
