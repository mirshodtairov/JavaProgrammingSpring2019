package Day63_Exception02;

public class CustomExceptionTest {
	public static void main(String[] args){
		double balance = 200;
		double transaction= 210;
		
		
		
		if (transaction>balance) {
			throw new UnsuffitianFoundsException("dgvhhwsj");
		}else {
			System.out.println("Purchase succcessfull");
			balance-=transaction;
		}
		
	}
	

}
