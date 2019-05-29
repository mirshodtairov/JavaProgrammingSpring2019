package Inharitence;

public class EmployeesWithDepartment {


		
		public static void main(String[] args) {
			
			
			
			Imployee Sarah= new Imployee(13, "Sarah", "Yasher", 6000);
			department ITDepartment = new department(10, "IT");
			Sarah.SetDepartment(ITDepartment);
			
		     System.out.println(Sarah.getDepartment().getdepartmentName());
		}

	

}
