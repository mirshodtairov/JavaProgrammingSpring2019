package Day15StringManipulation2;

public class contains {

	public static void main(String[] args) {
		String email = "test@gmail.com";
		System.out.println(email.contains("@"));

		String list = "apples, tomatoes, bananas, milk, bread";
		if (list.contains("apples")) {
			System.out.println("aplles are there");
		} else {
			System.out.println("add apples");
		}

		boolean hasEggs = list.toUpperCase().contains("eggs");
		System.out.println("Contains eggs: " + hasEggs);

		email = "name@yahoo.com";
		if (email.contains("yahoo")) {
			System.out.println("yahoo account");
		} else if (email.contains("gmail")) {
			System.out.println("gmail account");
		} else if (email.contains("mail")) {
			System.out.println("mail account");
		}

	}
}