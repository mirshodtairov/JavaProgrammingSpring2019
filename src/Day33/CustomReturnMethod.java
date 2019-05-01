package Day33;

public class CustomReturnMethod {

	public static void main(String[] args) {
		
		Add(3, 5);
		System.out.println(add2(4,6));

	}
	public static void Add(int num1, int num2) {
		int result=num1+num2;
		System.out.println(result);
	}
	public static int add2(int n1, int n2) {
		int result = n1+n2;
		return result;
	}public static int multiply (int n1, int n2) {
		int result = n1*n1;
		return result;
	}
	
	public static int minus (int n1, int n2) {
		int result = n1-n2;
		return result;
					
	}
	public static int devide (int n1, int n2) {
		int result = n1/n1;
		return result;
	
	}
	
}
