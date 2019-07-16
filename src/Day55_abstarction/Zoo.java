package Day55_abstarction;

public class Zoo {
	public static void main(String[] args) {
		cat cat = new cat("");
		cat.speak();
		dog poohchi = new dog("kakashka");
		poohchi.speak();
		poohchi.setName("Poohchi");
		cat.produceMilk();
		
		
	}

}
