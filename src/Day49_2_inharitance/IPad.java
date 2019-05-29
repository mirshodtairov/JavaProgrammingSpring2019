package Day49_2_inharitance;

import Day49.device;

public class IPad extends device {
	
	public void readEbook(String title) {
		System.out.println("reading a book "+ title +" using"+ brand+ " tablet" );
		System.out.println("mode "+ model);
		System.out.println();
	}
	
	

}
