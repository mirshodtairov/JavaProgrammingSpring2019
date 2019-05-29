package Day37;

import java.util.ArrayList;

public class MyCity {

	public static void main(String[] args) {
		ArrayList<String> cites = new ArrayList<String>();
		cites.add("barnaul");
		cites.add("Bukhara");
		cites.add("Tashkent");
		cites.add("Baku");
		cites.add("Moskow");

		for (String string : cites) {
			System.out.println(string);
			

		}
		System.out.println();
		for (int i = 0; i < cites.size(); i++) {
			System.out.println(cites.get(i));
		}
		System.out.println("Removed city");
		cites.remove("baku");
		System.out.println(cites);
		
		System.out.println(cites);
		
		
		
	}

}
