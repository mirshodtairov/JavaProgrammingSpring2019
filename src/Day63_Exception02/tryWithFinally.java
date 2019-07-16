package Day63_Exception02;

public class tryWithFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("in try block");
			System.out.println(10/0);
		}finally {
			System.out.println("in Finally");
		}
		
		System.out.println("After finally");

	}
	

}
