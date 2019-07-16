package ArrayAssignments;

import java.util.ArrayList;

public class ArrayHas55 {

	public static void main(String[] args) {
		
		for (int i = 11; i <=121; i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
			
		}

	}

	public static boolean appearsTwice(String target, String sentence) {
		  
		  int count= 0;
		  String [] aaa = sentence.split(" ");
		  
		  for (int i = 0; i < aaa.length; i++) {
			  if(aaa[i].equals(target)) {
				  count++;
				  
			  }
			
		}if(count>=1) {
		  

			return true;
			}else {
				return false;
			}
		
		
		}
	

}