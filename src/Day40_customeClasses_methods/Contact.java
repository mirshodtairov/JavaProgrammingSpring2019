package Day40_customeClasses_methods;

public class Contact {

	String name;
	String phoneNumber;
	String email;

	public void call() {
		System.out.println("calling"+name);
	}

	public void sendMessage() {
		System.out.println("sending messege "+phoneNumber);
	}

	public void sendEmail() {
		System.out.println("Sending Email "+email);
	}

}
