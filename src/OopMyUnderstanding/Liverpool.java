package OopMyUnderstanding;

public class Liverpool extends skills{

	String firstName;
	String lastName;
	int numbeOnAShirt;
	String position;
	double salary;
	

	public void dataOfPlayer(String firstName, String lastName, int numbeOnAShirt, String position, double salary) {
		setFirstName(firstName);
		setLastName(lastName);
		setNumbeOnAShirt(numbeOnAShirt);
		setPosition(position);
		setSalary(salary);

	}
	

	@Override
	public String toString() {
		return "Liverpool [firstName=" + firstName + ", lastName=" + lastName + ", numbeOnAShirt=" + numbeOnAShirt
				+ ", position=" + position + ", salary=" + salary + "]";
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

	public int getNumbeOnAShirt() {
		return numbeOnAShirt;
	}

	public void setNumbeOnAShirt(int numbeOnAShirt) {
		this.numbeOnAShirt = numbeOnAShirt;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

	
}
