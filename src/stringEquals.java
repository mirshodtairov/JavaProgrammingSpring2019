
public class stringEquals {

	public static void main(String[] args) {
	
	String str1 = "java";
	String str2 = "java";
	
	System.out.println(str1==str1); //this gives you boolean answer 
	System.out.println(str1=="java");
	System.out.println(str2=="java");
	
	System.out.println(str1.equals(str2));
	System.out.println(str1.equals("java"));
	System.out.println(str2.equals("java"));
	
	String month = new String("march");
	String month2 = new String("march");
	
	System.out.println(month == month2);
	System.out.println(month.equals("march"));
	System.out.println(month.equals("march"));
	
	//in the above exmp by using equals method java checking if value are the same.
	//this is the proper way to comparing strings
	
	
	
	
	
	
	
	

	}

}
