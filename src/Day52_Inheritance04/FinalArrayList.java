package Day52_Inheritance04;

import java.util.*;



public class FinalArrayList {
	
	public static void main(String[] args) {
		final ArrayList<String> COLLORS = new ArrayList<>();
		COLLORS.add("Orange");
		COLLORS.add("Yellow");
		COLLORS.add("White");
		COLLORS.add("Grey");
		COLLORS.add("Blue");
		
		
		
		System.out.println(COLLORS.toString());
		//COLLORS = new ArrayList<String>();  is not possible to creat new object from same object
		System.out.println(COLLORS);
		
		COLLORS.add("Pink");
		System.out.println(COLLORS);
		
		
		
		
		
	}

}
