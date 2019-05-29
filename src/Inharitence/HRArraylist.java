package Inharitence;

import java.util.*;



public class HRArraylist {

	public static void main(String[] args) {
		System.out.println("===================ARRAY LIST============================");
	     List<Imployee> myList = new ArrayList<>(); 
	     myList.add(new Imployee(8, "Aaron", "Ramsey", 350000));
	     myList.add(new Imployee(10, "Mesut", "Ozil", 250000));
	     myList.add(new Imployee(14, "Alexander", "Lacazet", 230000));
	     
	     double bonus =  myList.get(0).getSalary()+50000;
	     myList.get(0).setSalary(bonus);
	     System.out.println(myList.get(0).getSalary());
	     
	     for (int i = 0; i < myList.size(); i++) {
	    	 if (myList.get(i).getSalary()>300000) {
	    		 System.out.println(myList.get(i).getFirstName()+", "+myList.get(i).getLastName());
	    	 }
	    	 
			
		}
	    
	     
		
	}

}
