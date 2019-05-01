package day32MethodsWithReturn;

public class Cooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		add("rice");
		mix(60);
		fry(10);
		boil(3);

	}
	public static void add(String ing) {
		System.out.println("Add "+ing);
	}
	public static void mix(int secong) {
		System.out.println("mix forc"+secong+" seconds");
		
	} 
	public static void fry (int minutes) {
		System.out.println("fry for "+minutes+" minutes");
	}
	public static void boil (int minutes) {
		System.out.println("boil for "+minutes+" minutes");
	}

}
