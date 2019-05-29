package Day36WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCommands {

	public static void main(String[] args) {
		ArrayList<String>myList=new ArrayList<>(5);
		myList.add("Orange");
		myList.add("Apple");
		myList.add("Banana");
		myList.add("Peach");
		myList.add("Cherry");
		String[] str = myList.toArray(new String[myList.size()]);
		System.out.println(Arrays.toString(str));
		
		String [] names = {"murodil", "vasya", "Babayan Pavel"};
	    ArrayList<String> s2 = new ArrayList<>(Arrays.asList(names));//converting to ArrayList string//
	    System.out.println(s2);
		
		
		
		System.out.println(myList);
		myList.add("Grapes");
		System.out.println(myList);
		System.out.println(myList.size());
		myList.remove("Grapes");
		System.out.println(myList);
		myList.remove(0);
		System.out.println(myList);
		myList.set(0, "Orange");
		System.out.println(myList);
		myList.add(1, "Apple");
		System.out.println(myList);
		int size = myList.size();
		System.out.println(size);
		String [] JustAString = new String[size];
		
		System.out.println(myList.indexOf("Apple"));
		
		ArrayList<String> myList2 = (ArrayList<String>)myList.clone();
		System.out.println(myList2);
		myList2.add("Apricote");
		System.out.println(myList2);
		
		
		
		
		
				
		ArrayList<String> myList3 = (ArrayList<String>)myList2.clone();
		String [] arr = {"Tomatoe", "Cucumbers", "Potatoes"};
		ArrayList<String> myList4 = new ArrayList<String>();
		myList4.size();
		System.out.println(myList4);
		
		System.out.println();
	
		
		
		
		
		
		
		
		

	}

}
