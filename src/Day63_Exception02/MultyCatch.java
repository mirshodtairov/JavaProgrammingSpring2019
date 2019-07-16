package Day63_Exception02;

public class MultyCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//System.out.println(0/0);
			String str = null;
			System.out.println(str.length());
			int[] arr= {10,4};
			System.out.println(arr[2]);
		}catch (ArithmeticException e) {          //child of Arithmetic
			System.out.println("Arithmetic Exception");
		}catch (NullPointerException n) {         //child of Runtime 
			System.out.println("NullPointerException");
		}catch (RuntimeException r) {             //this is parent of NullPoint and Arithmetic exception
			System.out.println("RuntimeException "+r.getClass().getSimpleName());
		}
		

	}

}
