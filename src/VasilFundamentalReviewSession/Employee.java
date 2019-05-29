package VasilFundamentalReviewSession;

public class Employee {

	String firstName;
	String lastName;
	int employee_id;
	int age;
	int hourlyRate;
	char gander;
	boolean isInsured;
	String title;
	String email;
	
	String[] titels= {"Developer", "Scrum master","BA", "PO", "SDET", "QA Analyst", "HR"};

	public void printInfo() {
		System.out.println("Name: " + firstName + "_" + lastName + "  employee age: " + age + " Eployee ID:"
				+ " hourly rate: " + hourlyRate + " gender: " + gander + " Is employee insured? " + isInsured
				+ " Titel: " + title + " email: " + email);
	}

	public String CreatingEmail() {
		return firstName + "_" + lastName + "@gamil.com";

	}

	
}
