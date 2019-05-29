package Day38_ArrayList03;

import java.util.ArrayList;
import java.util.List;

public class AddAll {

	public static void main(String[] args) {
		List<String>l2 =new ArrayList<>();
		l2.add("java");
		l2.add("python");
		
		List<String>l1 =new ArrayList<>();
		l1.add("java");
		l1.add("python");
		
		System.out.println(l1);
		System.out.println(l2);
		
		l1.addAll(l2);
		
		System.out.println(l1);
		l1.addAll(l1);
		System.out.println(l1);
		
		
		

	}

}
