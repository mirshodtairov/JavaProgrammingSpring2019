package Day64_Collections01;

import java.util.*;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> v = new Vector<String>();
		v.add("watter");
		v.add("tea");
		v.add("coffee");
		v.add("black tea");
		
		for (String string : v) {
			System.out.println(string);
		}
		
		
		System.out.println(v.size());
		System.out.println(v.get(0));

	}

}
