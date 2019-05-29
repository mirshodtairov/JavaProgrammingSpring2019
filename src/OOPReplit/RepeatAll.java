package OOPReplit;

import java.util.*;

public class RepeatAll {

	public static void main(String[] args) {

		ArrayList<Boolean> b = new ArrayList<>();
		b.add(true);
		b.add(false);
		b.add(false);
		
		repeatAL(b);

	

		

	
	}


	public static void repeatAL(ArrayList<Boolean> b) {

		  ArrayList<Boolean> temp = new ArrayList<>();
		
		  
			temp.addAll(b);
			temp.addAll(b);
			
			System.out.println(temp);

	}

}
