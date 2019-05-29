package Day38_ArrayList03;
import java.util.*;
public class ContainsMethod {

	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList<>();
		list.add("Jan");
		list.add("Feb");
		list.add("March");
		list.add("April");
		list.add("May");
		System.out.println(list);
		
		ArrayList <String> list2=list;//this is just pointing to the same memory location 
		ArrayList <String> month = new ArrayList<>(list);//this is the way of creating new ArraysList
		
		System.out.println(list2);
		
		list.add("Jan");
		list.add("June");
		list.add("July");
		list.add("August");
		list.add("Sepyember");
		list.add("October");
		
		
		System.out.println(month.contains("Jan"));
		System.out.println(month.containsAll(list));
		
		String Jan =list2.get(0);
		
		System.out.println(list.contains(Jan));
		
		System.out.println(month.indexOf("Feb")==1);
		System.out.println(month.get(1).equals("Feb"));
		
		
		ArrayList<String>month2 = new ArrayList<>(list2);
		
		System.out.println("Month "+month.toString());
		System.out.println("Month2 "+month2.toString());
		
		System.out.println(month2.containsAll(month));
		
		
		
		

	}

}
