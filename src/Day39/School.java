package Day39;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.name="roman";
		student.age=25;
		student.subject="java";
		
		System.out.println("name "+student.name);
		System.out.println("age "+student.age);
		System.out.println("subject "+student.subject);
		
		Student studnet2 = new Student();
		studnet2.name= "cleetus";
		studnet2.age = 33;
		studnet2.subject= "PhP";
		
		
		System.out.println(studnet2.name);
		System.out.println(studnet2.age);
		System.out.println(studnet2.subject);

	}

}
