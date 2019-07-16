package Day64_Collections01;
import java.util.*;
public class ArrayVSArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numsArray = {34,65,7};
		String [] days = new String[7];
        days[0]="Monday";
        days[1]="Teusday";
        
        //ArrayList 
        List <Integer>numsList= new ArrayList<>();
        numsList.add(100);
        numsList.add(12);
        numsList.add(0);
        numsList.add(1432);
        
        System.out.println(numsList.get(0));
        System.out.println(numsArray[0]);
        
        System.out.println(Arrays.toString(numsArray));
        
        
        
        
	}

}
