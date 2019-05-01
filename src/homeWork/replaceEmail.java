package homeWork;

import java.util.Scanner;

public class replaceEmail {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String email = scan.next();
	
		String name;
		String lastname;
		String domain;

		name = email.substring(0, email.indexOf("_"));
		lastname = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
		domain = email.substring(email.indexOf("@"));

		
		if (email.contains("_")) {
		System.out.println(lastname+""+"_"+name+""+domain);}
		else {System.out.println(email);
		

	}

}
}
