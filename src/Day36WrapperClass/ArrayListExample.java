package Day36WrapperClass;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String target ="aaa";
		ArrayList<String> langua = new ArrayList<>();
		
		ArrayList<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("English");
		languages.add("Russian");
		languages.add("Azeri");
		languages.add("Arabic");
		System.out.println("number of values "+languages.size());
		
		languages.add("turkish");
		System.out.println(languages.size());
		
		languages.remove(0);
		System.out.println(languages.get(0));
		

	}

}
