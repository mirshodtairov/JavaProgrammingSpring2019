package day28MultiiD;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FastFoodRest {

	public static void main(String[] args) throws IOException {
		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
		
		System.out.println("data size: "+data.length);
		
		//print each restaurant info in separate line
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[data.length-1]);
		int counter=0;
		for (String string : data) {
			System.out.println(counter+"->"+string);
			counter++;
			
		
			
		}
		int VA=0;
		for (int i = 0; i < data.length; i++) {
			if (data[i].contains(",VA,")) {
				VA++;
			}
			
		}
		System.out.println(VA);
		
		
		//String[] arr = data.split(",");
		for (String res : data) {
			if(res.contains(",VA,")) {
				String [] resArr= res.split(",");
			
				System.out.println(resArr[2]+" - "+resArr[1]);
			}
			
		}
		

	
	}

}
