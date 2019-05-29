package Day45;

import java.util.Random;

public class EtsyAccount {

	private String email;
	private String firstName;
	private String password;
	
	public EtsyAccount(String email, String firstName) {
		setEmail(email);
		setFirstName(firstName);
		this.password = getRendomPassword();
		
	}
	private String getRendomPassword() {
		Random ran = new Random();
		String letters= "abcdefghigklmnopqrstuvwxyz0123456789";
		String rdPassword= "";
		for (int i = 0; i < 6; i++) {
			rdPassword+=letters.charAt(ran.nextInt(letters.length()));
			
			
		}
		
		return rdPassword;
	}
	

	// constructor 1.
	public EtsyAccount() {
		email = "";
		firstName = "";
		password = "";
	}

	// constructor 2.
	public EtsyAccount(String email, String firstName, String password) {
		setEmail(email);
		setFirstName(firstName);
		setPassword(password);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {

		if (email.indexOf('@') > 0 && email.indexOf('@') != email.length() - 1) {
			this.email = email;
		} else {
			System.out.println("please enter a valid email");
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if(isValidFirstName(firstName)) {
		this.firstName = firstName;
				}else {
					System.out.println("invalid");
				}
	}

	private boolean isValidFirstName(String firstName) {
		if(firstName.startsWith(" ")|| firstName.endsWith(" ")) {
			return false;
		}
		
		if (firstName.isEmpty()) {
			System.out.println("cannot be blank");
			return false;
		}
		
		for (int i = 0; i < firstName.length(); i++) {
			char ch = firstName.charAt(i);
			if (!Character.isAlphabetic(ch) && ch != ' ') {
				return false;

			}
		}

		return true;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(password.length()<6) {
			System.out.println("Password must be at least 6 chars");
		}else {
			this.password = password;
		}
		
	}

	public String toString() {
		return "EtsyAccount [email=" + email + ", firstName=" + firstName + ", password=" + password + "]";
	}

}
