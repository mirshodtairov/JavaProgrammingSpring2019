package ArrayAssignments;

import java.util.Arrays;

public class theLondestWordinArray {

	public static void main(String[] args) {
		int counter=0;
		String longest="";
		String [] str= {"book", "classroom", "family", "codeBusters", "java"};
		for (String string : str) {
			if (longest.length()<string.length()) {
				longest=string;
				
			}
		}
		System.out.println(longest);
		
		Arrays.sort(str);
		for (String string2 : str) {
			System.out.println(string2);
		}
		
		System.out.println(Arrays.toString(str));
		
		
		

	}

}
