package Day16StingManipulation;

public class isEmpty {

	public static void main(String[] args) {
		String userName = "";
		String password = "";

		//System.out.println(userName.isEmpty());
//		if (userName.isEmpty()) {
//			System.out.println("user name cannot be field");
//		} else {
//			System.out.println("user name is empty");
//		}
		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("user name cannot be field");
		} else {
			System.out.println("user name is empty");
		}
		if (userName.length()==0) {
			System.out.println("user name length is zero so its empty");
		}
		
		

	}

}
