package Day30Methods;

public class EtsySearch {

	public static void main(String[] args) {
		navigateToEtsy();
		searchforwoodenspoo();
		printResults();
		study("Java");
		study("Python");
		study("C++");
		

	}
	public static void navigateToEtsy() {
		System.out.println("Lounch chrome, and open Etsy.com");
		
	}
	public static void searchforwoodenspoo(){
		System.out.println("Go to search and enter woodenspoon");
		
	}
	public static void printResults() {
		System.out.println("14,720 Results");
		
	}
	public static void study(String topic) {
		System.out.println("Student study "+topic);
	}

}
