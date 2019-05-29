package OopMyUnderstanding;

public class  Arsenal extends skills {

	String firstName;
	String lastName;
	int numbeOnAShirt;
	String position;
	double salary;
	boolean isVengerPlayer;

	public void dataOfArsenalPayers(String firstName, String lastName, int numbeOnAShirt, String position,
			double salary, boolean isVengerPlayer) {
		setFirstName(firstName);
		setLastName(lastName);
		setNumbeOnAShirt(numbeOnAShirt);
		setPosition(position);
		setSalary(salary);
		setVengerPlayer(isVengerPlayer);

	}
	public void defense() {
		System.out.println("exelent defensing arsenal");
		
	}

	@Override
	public String toString() {
		return "Arsenal [firstName=" + firstName + ", lastName=" + lastName + ", numbeOnAShirt=" + numbeOnAShirt
				+ ", position=" + position + ", salary=" + salary + ", isVengerPlayer=" + isVengerPlayer + "]";
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

	public boolean isVengerPlayer() {
		return isVengerPlayer;
	}

	public void setVengerPlayer(boolean isVengerPlayer) {
		this.isVengerPlayer = isVengerPlayer;
	}

}
