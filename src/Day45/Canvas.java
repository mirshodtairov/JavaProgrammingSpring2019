package Day45;

import java.util.*;

public class Canvas {

	public static void main(String[] args) {
		Course course = new Course();
		course.setName("Java Prog");
		
		List<String> teachers = new ArrayList<>();
		teachers.add("Vasyl");
		teachers.add("Murodil");
		teachers.add("Marufjon");
		teachers.add("Muhtar");

		course.setTeachers(teachers);

		System.out.println(course.toString());

		List<String> javaStudents = new ArrayList<>();
		javaStudents.add("Burak");
		javaStudents.add("Ethem");
		javaStudents.add("Sung");

		course.setStudents(javaStudents);

		System.out.println(course.toString());

		course.addTeachers("Maria");
		course.addStudent("Ekateria");

		if (course.getTeachers().contains("Maria")) {
			System.out.println("maria is there");
		} else {
			System.out.println("maria is not there");
		}

		course.removeTeacher("Murodil");
		course.removeStudents("Burak");

		if (!course.getTeachers().contains("Murodil")) {
			System.out.println("Murodil Is not there");
		} else {
			System.out.println("Murodil he is there");
		}
		if (!course.getStudents().contains("Roman")) {
			System.out.println("Roman is removed successfully");
		} else {
			System.out.println("Roman is still a student");
		}

	}

}
