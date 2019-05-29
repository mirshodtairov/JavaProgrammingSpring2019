package Day48_Inheritance01;

public class company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee();
		emp1.name = "marufjon";
		emp1.jobTitle = "teacher";
		emp1.gender = 'M';
		emp1.age = 22;
		Employee emp2 = new Employee();
		emp2.name = "keke";
		emp2.age = 25;
		emp2.gender = 'f';
		emp2.jobTitle = "HR";

		emp1.work();
		emp2.work();
		emp1.eat("chicken kesadia");
		emp2.eat("salad");
		emp1.walk();
		emp2.walk();

		emp1.sleep(5);
		emp2.sleep(8);

	}

}
