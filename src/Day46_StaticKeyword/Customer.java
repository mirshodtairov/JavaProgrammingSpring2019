package Day46_StaticKeyword;

import Day19.polindrom;

public class Customer {

	private String name;
	private String email;
	
	static int count;//sharedd by  everyone/ aal objects
	                 

	
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}

	
	
	
	public Customer() {
		email = "undifined";
		name = "undifined";
		count++;
	}

	
	
	
	public Customer(String name, String email) {
		this.email = email;
		this.name = name;
		count++;

	}

	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
