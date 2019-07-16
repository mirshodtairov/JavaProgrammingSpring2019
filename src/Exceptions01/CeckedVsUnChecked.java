package Exceptions01;

public class CeckedVsUnChecked {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		//checked exception - InteruptedException
		
		try {
		Thread.sleep(2000);
		}catch (Exception e) {
			System.out.println("Sleep has been handled ");
		}
		
		

	}

}
