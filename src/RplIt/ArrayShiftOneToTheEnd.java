package RplIt;

import java.util.Scanner;

public class ArrayShiftOneToTheEnd {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] nums = new int[size];
	    for(int i = 0; i < size; i++){
	      nums[i] = scan.nextInt();
	    }
	    String a ="";
			String b = "";

			for (int z = nums.length - 1; z < nums.length; z++) {

				a += nums[z]+",";
			}
			for (int i = 0; i < nums.length - 1; i++) {

				b += nums[i]+",";

			}
			
			System.out.println("["+a+""+b.substring(0,b.length()-1)+"]");

		}
		
	}

	    
	    

	  
