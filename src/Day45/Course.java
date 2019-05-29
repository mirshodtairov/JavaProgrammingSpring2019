package Day45;

import java.util.*;

public class Course {
	
	private String name;
	
	private List<String> teachers= new ArrayList<>();
	private List<String> students= new ArrayList<>();
	
	
	
	public void addStudent(String sName) {
		students.add(sName);
	}
	
	public void addTeachers(String tName) {
		teachers.add(tName);
	}
	
	public void removeStudents(String sName) {
		students.remove(sName);
		
	}
	public void removeTeacher(String tName) {
		teachers.remove(tName);
		
	}
	
	
	
	@Override
	public String toString() {
		return "Course [name=" + name + ", teachers=" + teachers + ", students=" + students + "]";
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public List<String> getTeachers() {
		return teachers;
	}
	
	
	public void setTeachers(List<String> teachers) {
		this.teachers = teachers;
	}
	
	
	public List<String> getStudents() {
		return students;
	}
	
	
	public void setStudents(List<String> students) {
		this.students = students;
	}
	

}
