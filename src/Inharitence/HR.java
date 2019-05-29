package Inharitence;

public class HR {

	public static void main(String[] args) {
		
		Imployee [] employees = new Imployee[3]; 
		employees[0] = new Imployee(100, "Steave", "King", 6000);
		employees[1] = new Imployee(101, "Albert", "Camara", 3000);
		employees[2] = new Imployee(102, "Pier_Emerik", "Aubameyang", 7000);
		
		System.out.println(employees[0].getFirstName()+": "+employees[0].getSalary());
		System.out.println(employees[1].getFirstName()+": "+employees[1].getSalary());
		System.out.println(employees[2].getFirstName()+": "+employees[2].getSalary());
		
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].getFirstName()+"_"+employees[i].getLastName()+"@gmail.com");
		}
		for (Imployee imp : employees) {
			System.out.println(imp.getFirstName()+" "+imp.getSalary());
			
		}
		for (int j = 0; j < employees.length; j++) {
			
			//System.out.println(employees[j].getFirstName()+": "+employees[j].getSalary());
			Imployee tempImp = employees[j];
			System.out.println(tempImp.getFirstName()+" "+tempImp.getLastName());
			
		}
		
	
		
		
		

	}

}
