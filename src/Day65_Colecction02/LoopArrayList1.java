package Day65_Colecction02;
import java.util.*;
public class LoopArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>nums = new ArrayList<>();
		nums.add(50);
		nums.add(60);
		nums.add(70);
		nums.add(80);
		nums.add(90);
		for(Integer n: nums) {
			System.out.print(n+" | ");
		}
		System.out.println();
		
		
		for (int i = 0; i < nums.size(); i++) {
			System.out.print(nums.get(i)+" | ");
		}
		System.out.println();
		
		nums.forEach(n -> System.out.print(n+ " | "));
		System.out.println();
		
		
		nums.contains(90);
		System.out.println("Remove 90");
		nums.forEach(i -> System.out.print(i+" | "));
		System.out.println();
		
		
		nums.removeIf(i -> i <=80);
		nums.forEach(i -> System.out.print(i+" | "));
		nums.forEach(i -> System.out.print(i+" | "));
		

	}
	

}
