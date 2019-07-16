package Exceptions01;

public class tryCatchfinally {
	public static void main(String[] args) {
		
		String str = new String();
		str = "Selenium";
		
		try {
			System.out.println(str.length());
			System.out.println(str.charAt(100));
		}catch (Exception e) {
			System.out.println("enter correct index");
			System.exit(0);
			
		}finally {
			System.out.println("Finally block");
		}
		
		
		
	}

}
