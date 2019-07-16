package Exceptions01;

public class ExceptionInCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "10j";                                 // A

		try {
			int a = Integer.parseInt(str);                  // B  
			System.out.println(a);                          // C
		} catch (NumberFormatException e) {
			System.out.println(str.charAt(10));              // D <--problem 
			System.out.println("In tje catch block Hello");  // E

		} finally {
			
			System.out.println("hello from finnaly block ");  //F

		}
		System.out.println(str.length());                     //Z

	}

}
