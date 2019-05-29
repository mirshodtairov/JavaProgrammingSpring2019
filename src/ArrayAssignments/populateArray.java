package ArrayAssignments;

import java.util.*;

public class populateArray {

	public static void main(String[] args) {

	    int [] i= new int[3]; 
	    i= populate(i) ;
	    System.out.println(Arrays.toString(i));


	}

	public static int[] populate(int[] r) {
		
		int size=r.length;
		int [] aaa = new int [size];
		for (int i = 0; i < aaa.length; i++) {
			aaa[i]=i+1;
			
			
		}
		return aaa;
		

	}

}
