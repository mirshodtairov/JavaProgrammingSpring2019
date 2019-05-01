package Day16StingManipulation;

public class capitalSwitching {

	public static void main(String[] args) {
		String str = "moscow is the capital of russia";
		str=str.replace("moscow", "baku");
		System.out.println(str);
		
		String email="mirshodtairov@yahoo.com";
		String company = "deloitte";
		String newemail= email.replace("yahoo", "gmail");
		
		System.out.println(newemail);		

	}

}
