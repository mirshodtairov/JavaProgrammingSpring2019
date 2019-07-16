package Day63_Exception02;

public class OrCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		try {
			
			System.out.println(str.charAt(10));
			String sr2="";
			System.out.println(sr2.toLowerCase());
		}catch(IndexOutOfBoundsException | NullPointerException e) {
			System.out.println("choses one");
			
		}finally {
			System.out.println("Finnaly block");
			
		}
				

	}

}
