package homeWork;

import java.util.Scanner;

public class emailSeperation {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String email = scan.next();
		    
		    String firsrname = email.substring(0, email.indexOf("_"));
		    String lastName= email.substring(email.indexOf("_")+1, email.indexOf("@"));
		    String Domain = email.substring(email.indexOf("@")+1, email.indexOf("."));
		    String TLDomain = email.substring(email.indexOf(".")+1);
		    
		    String N1 = firsrname.substring(0, 1).toUpperCase();
		    String nameCapitalized = N1 + firsrname.substring(1);
		    String N2 = lastName.substring(0, 1).toUpperCase();
		    String nameLastCapitalized = N2 + firsrname.substring(1);
		    
		    
		    System.out.println("First Nmae:"+nameCapitalized);
		    System.out.println("Last Nmae:"+nameLastCapitalized);
		    System.out.println("Domain:"+Domain);
		    System.out.println("Top Level Domain:"+TLDomain);
		    
	}

}
