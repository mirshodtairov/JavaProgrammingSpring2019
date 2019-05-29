package Inharitence;

public class Imployee {
	
	private int imployee_id;
	private String firstName;
	private String lastName;
	private String email;
	private double salary;
	private department department;
	
	public department getDepartment() {
		return department;
	}
	public void SetDepartment(department department ) {
		this.department=department;
	}
	
	
	public Imployee() {	
	}
	
	
	
	public Imployee(int imployee_id, String firstName, String lastName, double salary) {
	
		this.imployee_id = imployee_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public int getImployee_id() {
		return imployee_id;
	}
	public void setImployee_id(int imployee_id) {
		this.imployee_id = imployee_id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
