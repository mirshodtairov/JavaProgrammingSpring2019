package OfficeHoursMaruf;

import Day42CustomClasses_Incapsulation.people;

public class CallPeopleFromHere {

	public static void main(String[] args) {
		People pl= new People();
		System.out.println(pl.hartToGet);
		
		System.out.println(People.easyToGet);
		
		pl.sayMyName();
		
		People.whatsMyName();
		
		
	}

}
