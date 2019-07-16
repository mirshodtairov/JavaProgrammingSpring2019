package ArrayAssignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public String blogDb(ArrayList<String[]> r, String id) {
		ArrayList<String> list = new ArrayList<>();
		
		for (int i = 0; i < r.size(); i++) {
		  		if(r.get(i).equals(id))	{
		  			
		  		}
		}
		return id;
		
		

	}

	public static void main(String[] args) {
		Main m = new Main();
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String[]> arr = new ArrayList<String[]>();
		arr.add(new String[] { "1", "title 1", "content" });
		arr.add(new String[] { "2", "title 2", "content" });
		arr.add(new String[] { "3", "title 3", "content3" });
		
		

		
		
//		String post = m.blogDb(arr, "3");
//		System.out.print(post);
//	
		
		//should output:
	    //title 3 
	    //content3
	   

	}
}