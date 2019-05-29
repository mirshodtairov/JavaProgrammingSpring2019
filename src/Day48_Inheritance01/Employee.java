package Day48_Inheritance01;

public class Employee extends person {
	
	String jobTitle;
	
	
	
	public void work() {
		System.out.println(name+" is working as "+jobTitle);
	}

}
