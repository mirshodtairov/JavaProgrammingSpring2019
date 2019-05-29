package Day44;

public class Job {

	/*
	 * Job class
	 * 
	 * title , company , annualSalary
	 * 
	 * Encapsulate above private instance fields Create no parm constructor to set
	 * title, company to "undefined"
	 * 
	 * Create 1 parm constructor to set title Create 3 arg constructor to set all 3
	 * fields
	 * 
	 * create a method called toString
	 */

	private String company;
	private String title;
	private double salary;
	
	
	
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\ncosatarctorGetterSetterWarmUp [company=" + company + ", title=" + title + ", salary=" + salary + "]";
	}
	
	public  Job(String company, String title, double salary) {
		System.out.println("all parametrs");
		setTitle(title);
		this.company=company;
		this.salary=salary;
		
		
		
	}
	
	public  Job(String title) {
		System.out.println("one parametr");
		this.title=title;
		this.company= "undefined";
		//setSalary(salary);
		
		
		
	}
	
	public  Job() {
		System.out.println("No Parametr");
		company="undefined";
		salary=salary;
	
		
	}
	
	
	
	
	
	
	
	
	

}
