package Day14StringManipulation;

public class StringSize {

	public static void main(String[] args) {
		String str1 = "Good Morning";
		if (str1.equals("GoOd Morning")) {
			System.out.println("match");
		} else {
			System.out.println("not match");
		}
		if (str1.equalsIgnoreCase("good morning")) {
			System.out.println("match");
		} else {
			System.out.println("not match");
		}
		System.out.println(str1.toUpperCase());
		System.out.println(str1);
		str1 = str1.toUpperCase();
		System.out.println("after assigment: " + str1);
		// good morning ==> good morning
		if (str1.toLowerCase().equals("good morning")) {
			System.out.println("Chaining method:  match ");
		} else {
			System.out.println("Chain method: does not match");

		}
		String myname = "mirshod";
		System.out.println(myname.length());

		int num = myname.length();
		System.out.println("My name has " + num + " character");

		String username = "tairov";
		if (username.length() == 8) {
			System.out.println("invalid user name");
		} else {
			System.out.println("valid user name");

			String password = "abc123";
			if (password.length() >= 6) {
				System.out.println("invalid password");
			} else {
				System.out.println("valid password");

			}
			int passwordLength = password.length();
			if (passwordLength<6) {
				System.out.println("invalid");
			}else {System.out.println("valid");}

		}
	}
}
