package RplIt;

import java.util.Arrays;
import java.util.Scanner;

public class addMoreIntToArray {

	public static void main(String[] args) {
		  Scanner inp = new Scanner(System.in);
		int size = inp.nextInt(),n = inp.nextInt();
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++)
	    {

	        arr[i]=inp.nextInt();
	    }
	    
	    System.out.println(Arrays.toString(add_to_r(arr, n)));
	     
	    
	  }
	public static int[] add_to_r(int [] arr, int a) {
		arr = Arrays.copyOf(arr, arr.length+1);
		arr[arr.length-1]=a;
		return arr;
		
	}
	
	}