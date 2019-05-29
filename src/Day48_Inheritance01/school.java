package Day48_Inheritance01;

public class school {

	public static void main(String[] args) {
		person person = new person();
		student student = new student();

		person.name = "Obama";
		person.age = 57;
		person.gender = 'm';

		student.name = "Roman";
		student.age = 30;
		student.gender = 'm';

		person.eat("steak");
		student.eat("grechka");

		person.walk();
		student.walk();

		person.sleep(8);
		student.sleep(7);
		student.clazz = "Ping pong";

		student student2 = new student();
		student2.name = "Orhan";
		student2.age = 40;
		student2.gender = 'm';
		
		student2.clazz = "Agile Scrum";

		student2.code("Java");
		student2.attendClass();
		student2.eat("kebab");
		student2.walk();
		

	}

}
