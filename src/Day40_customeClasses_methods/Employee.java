package Day40_customeClasses_methods;

public class Employee {
	
	public String name;
	public String jobTitle;
	int salary;
	
	public void goToBreak() {
		System.out.println(name+ " going to break");
		
	}
	public void work () {
		System.out.println(name+" going to work");
	}
	public void attendMeeting() {
		System.out.println(name+" attending meeting");
		
	}
	public void introduce() {
		System.out.println("name ["+name+"] Job Title ["+jobTitle+"] Salary: ["+salary+"]");
		
	}
	
	
	
	

}

