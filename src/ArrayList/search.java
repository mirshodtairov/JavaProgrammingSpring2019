package ArrayList;

import java.util.ArrayList;

public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>  arr = new ArrayList<String>();
	    arr.add("2");
	    arr.add("6");
	    arr.add("foo bar");
	    arr.add("abc");
	    String find_tst = "foo";
	    
	    System.out.println(search(arr, find_tst));

	}

	public static String search(ArrayList<String> r, String find) {
		
		for (int i = 0; i < r.size(); i++) {
			if(r.get(i).contains(find)) {
				return r.get(i);
			}
			
					
			
		}
		return "search failed";
	}

}
