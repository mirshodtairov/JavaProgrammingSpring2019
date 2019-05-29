package Day38_ArrayList03;

import java.util.*;

public class RawArrayList {

	public static void main(String[] args) {
		ArrayList List = new ArrayList();
		List.add("saturday");
		List.add("saturday");
		List.add(100);
		List.add(2000);
		List.add(true);
		
		
		System.out.println(List.toString());
		String allValues = List.toString();
		System.out.println(allValues);
		
		String str= List.get(0).toString();
		System.out.println(str);
		
		
		
	}

}
