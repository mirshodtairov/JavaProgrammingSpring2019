package Day38_ArrayList03;

import java.util.ArrayList;
import java.util.List;

public class RemoveAll {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(12);
		list.add(22);
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(30);
		list1.add(125);
		list1.add(12);
		list1.add(4);
		list1.add(6);
		list1.add(22);
		
		
		list1.removeAll(list);
		System.out.println(list1);
		
		
		
		

	}

}
