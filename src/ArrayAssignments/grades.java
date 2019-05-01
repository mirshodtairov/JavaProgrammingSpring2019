package ArrayAssignments;

public class grades {

	public static void main(String[] args) {
		String [] grades = {"one", "two" , "three", "fore", "five"};
//		for(char grades2: grades);
		for(String city: grades)  {
			if (city.length()>=2)
				
			System.out.println(city.substring(0,2));
		}
		

	}
	

}
