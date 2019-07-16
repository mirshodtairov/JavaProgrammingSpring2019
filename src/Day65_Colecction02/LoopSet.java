package Day65_Colecction02;
import java.util.*;

public class LoopSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> numsSet = new HashSet<>();
		numsSet.add(10);
		numsSet.add(30);
		numsSet.add(30);
		numsSet.add(89);
		numsSet.add(45);
		numsSet.add(78);
		System.out.println(numsSet.size());
		for(int n : numsSet) {
			System.out.println(n+ " | ");
		}
		
		numsSet.forEach(n -> System.out.print(n+ " | "));
		

	}

}
