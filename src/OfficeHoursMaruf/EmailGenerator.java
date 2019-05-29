package OfficeHoursMaruf;

import Polimorphism_Tim.main;

public class EmailGenerator {
	
	static String CompanyName= "Deloitte";
	String name;
	
	
	public EmailGenerator(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return name + "@"+CompanyName+".com";
	}
	
	
	public static void main(String[] args) {
		EmailGenerator e1= new EmailGenerator("Vasiliy");
		System.out.println(e1.getEmail());
		EmailGenerator e2= new EmailGenerator("Florida");
		System.out.println(e2.getEmail());
		
	}
	
	


}

