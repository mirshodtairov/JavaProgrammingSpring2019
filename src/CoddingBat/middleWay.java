package CoddingBat;

import java.util.Arrays;

public class middleWay {
	public static void main(String[] args) {
		
	
	
	int [] c= {1,3,5,7,0};
	int [] cv= {3,4,5,8,0};
	System.out.println(Arrays.toString(middleWay(c, cv)));
	
	

	}
	public static int[] middleWay(int[] a, int[] b) {
		
		int [] arr = new int[2];
		
		arr[0]=a[a.length/2];
		arr[1]=b[b.length/2];
		return arr;
		
		
	
		  
	}
	

}
