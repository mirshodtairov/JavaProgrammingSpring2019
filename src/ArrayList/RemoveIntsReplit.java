package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIntsReplit {

	public static void main(String[] arg) {
		// TODO Auto-generated method stub

	    ArrayList<Integer>  arr = new ArrayList<>();
	    Integer[] nums = new Integer[]{1,1,1,2,3,1,4,1,1};
	    arr.addAll(Arrays.asList(nums));
	    
	    
	    
	    System.out.print(removeInst(arr,1));

	}
	
	 public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n)  {
		 
		 //int aaa=;
		 for (int i = 0; i < r.size(); i++) {
			 
			 if(r.get(i)==n) {
				 r.remove(r.get(i));
				 
			 }
			
		}
		 
		 
		return r;
	   
	   
	  }

}
