package VasilFundamentalReviewSession;

public class Company {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
	    emp1.firstName= "Granit";
		emp1.lastName = "Shaka";
		emp1.age = 27;
		emp1.employee_id= 20;
		emp1.gander= 'M';
		emp1.isInsured= true;
		emp1.hourlyRate = 110;
		emp1.title= "developer";
		
		
		
		
		Employee emp2 = new Employee();
		
		emp1.CreatingEmail();
		emp1.printInfo();
		System.out.println(emp1.CreatingEmail());
		
		
		
		
		

		
	}

}
