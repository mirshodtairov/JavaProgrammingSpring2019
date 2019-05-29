package OOPReplit;

import java.util.Arrays;

public class addElement {

	public static void main(String[] args) {
		
		int [] ar1= {10, 40, 50, 3, 1};
		int [] ar2= {11, 0, 500, 44, 1101};
		
		System.out.println(Arrays.toString(addElements(ar1, ar2)));
		

	}
	 public static int[] addElements(int[] ints1, int[] ints2) {
		 int [] result= new int[ints1.length];
		 for (int i = 0; i < result.length; i++) {
			result[i]+=ints1[i]+ints2[i];
		}
		return result;
		    
		    
		    
	  }
	  

}
