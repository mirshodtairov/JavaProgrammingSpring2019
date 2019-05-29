package RplIt;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		int [] num1 = {1,2,3,4};
		int [] num2 = {5,6,7,8};
		System.out.println(Arrays.toString(mergR(num1, num2)));
		
	}
	  public static int[] mergR(int[] a,int[] b) {
		    
		      int z = 0;
		      int length= a.length+b.length;
		       int [] arr=new int[length];
		
		    
		
		    for (int i = 0; i < a.length; i++) {
				arr[i]=a[i];
				z++;
				
				
				
			}
		    for (int j = 4; j < b.length; j++) {
				arr[z++]=b[j];
				
			}
			
		   
		       return arr;
		  }
	   
	  
	

}
