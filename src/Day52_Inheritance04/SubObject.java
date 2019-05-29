package Day52_Inheritance04;

import Polimorphism_Tim.main;

public class SubObject  {
	
	@Override
	public String toString() {
		return "SubObject [name=" + name + ", last=" + last + "]";
	}




	String name;
	String last;
	
	
	
	
	public static void main(String[] args) {
		SubObject sb = new SubObject();
		
	}

}
