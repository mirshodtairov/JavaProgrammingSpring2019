package Day38_ArrayList03;

import java.util.ArrayList;
import java.util.List;

public class MethodsSummary {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("red");
		list1.add("blue");
		list1.add("white");
		list1.add("grey");
		list1.add("black");
		list1.add(0, "yellow");

		System.out.println(list1);

		System.out.println("number of element " + list1.size());

		System.out.println("index of 3 " + list1.get(3));

		System.out.println("removes value from index " + list1.remove(0));

		list1.remove("blue");

		System.out.println(list1);

		list1.set(0, "orange");

		System.out.println(list1.indexOf("grey"));

		System.out.println("is list empty? "+list1.isEmpty());
		
		System.out.println("is list empty? "+(list1.size()==0));
		
    	System.out.println("is white in the list! "+list1.contains("white"));
    	
    	
    	List<String> list2 = new ArrayList<>();
    	
    	list2.addAll(list1);
    	
    	System.out.println("contains all "+list2.containsAll(list2));
    	
    	System.out.println("equals "+list1.equals(list2));
    	
    	list2.add("pink");
    	
    	list2.removeAll(list1);
    	
    	System.out.println("list 2 after removeAll "+ list2);
    	
    	System.out.println("list1"+list1);
    	
    	list2.addAll(0, list1); 
    	System.out.println("list 2 after adding list 1 "+list2);
    	
    	list1.clear();
    	list2.clear();
    	
    	System.out.println("list 1 is empty");
    	System.out.println("list 2 is empty");
    	
//		list2.add("red");
//		list2.add("blue");
//		list2.add("white");
//		list2.add("grey");
//		list2.add("black");
//		list2.add(0, "yellow");
    	
	}

}
