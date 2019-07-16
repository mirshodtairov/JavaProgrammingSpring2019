package Day64_Collections01;
import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <Integer>  mySet = new HashSet<>();
		mySet.add(100);
		mySet.add(200);
		mySet.add(132);
		mySet.add(5);
		mySet.add(2);
		mySet.add(1000);
		mySet.add(2000);
		mySet.add(1000);//if you want to add smth same it wont take it 
		System.out.println(mySet.toString());
		System.out.println(mySet.hashCode());
		
		
		
		List<String>list= Arrays.asList("12","as","sd","bd","ap");
		//System.out.println(list.hashCode());
		
		
		Set<String> unuque = new HashSet<>();
		System.out.println(unuque.toString());
		
		System.out.println(list.get(0));
		
		
		
		

	}

}
