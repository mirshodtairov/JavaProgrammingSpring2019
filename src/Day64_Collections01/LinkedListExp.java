package Day64_Collections01;
import java.util.*;
public class LinkedListExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer>list = new LinkedList<Integer>();
		LinkedList <Integer>list2 = new LinkedList<Integer>();
		list.add(200);
		list.add(23);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println();
		
		
		list2.add(34);
		list2.add(45);
		list2.add(632);
		list2.add(9);
		
		System.out.println(list2.getFirst());
        list2.addFirst(1);
        System.out.println(list2.toString());

	}

}
