package Day50_inheritance3;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contractor cont= new Contractor();
		FullTimeEmployee ft= new FullTimeEmployee();
		Employee em = new Employee();
		
		em.calculatePay(40, 40);
		ft.calculatePay(40, 45);
		cont.calculatePay(40, 55);

	}

}
