package CustomMethod;

public class acumilatorMethods {

	public static void main(String[] args) {
		String myStars=getStars(5);
		System.out.println(myStars);
		System.out.println(getStars(10));
		
		int [] mmm= {1,2,3,4,3,2,1};
		for (int i : mmm) {
			System.out.println(getStars(i));
		}
		
		

	}
	public static String getStars(int num) {
		String stars="";
		for (int i = 1; i <=num; i++) {
		
			stars=stars+"*";
			
		}
		return stars;
		
		
	}
	
	

}
