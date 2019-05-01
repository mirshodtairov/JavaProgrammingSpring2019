package homeWork;

import java.util.Scanner;

public class startindpointendingpoint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String start = scan.next();
	    String end = scan.next();
	    
	    
	    String s = "A right >B down >C left >D up >A right >B down >C left ";
	    if(start.equalsIgnoreCase(end)){
	            System.out.println(start + " found");
	        }
	    else{
	         s= s.substring(s.indexOf(start),s.length()-1);
	         s = s.substring(s.indexOf(start),s.indexOf(end));
	         s = s.replace("A","").replace("B","").replace("C","").replace("D","");
	         s=s.substring(1,s.length()-2);
	         System.out.println(s+ ": " + end + " found");
	        }
	    
//	    
//	    if (start.equalsIgnoreCase("A")&& end.equalsIgnoreCase("B")){
//	    	System.out.println("right: B found");}
//	    else if (start.equalsIgnoreCase("A")&& end.equalsIgnoreCase("C")){
//	    	System.out.println("right > down > : C found");}
//	    else if (start.equalsIgnoreCase("A")&& end.equalsIgnoreCase("D")){
//	    	System.out.println("right > down > left: D found");}
//	    else if (start.equalsIgnoreCase("A")&& end.equalsIgnoreCase("A")){
//	    	System.out.println("A found");}
//	    
//	    else if (start.equalsIgnoreCase("B")&& end.equalsIgnoreCase("A")){
//	    	System.out.println("down > left > up: A found");}
//	    else if (start.equalsIgnoreCase("B")&& end.equalsIgnoreCase("B")){
//	    	System.out.println("B found");}
//	    else if (start.equalsIgnoreCase("B")&& end.equalsIgnoreCase("C")){
//	    	System.out.println("down: C found");}
//	    else if (start.equalsIgnoreCase("B")&& end.equalsIgnoreCase("D")){
//	    	System.out.println("down > left: D found");}
//	    
//	    else if (start.equalsIgnoreCase("C")&& end.equalsIgnoreCase("C")){
//	    	System.out.println("C found");}
//	    else if (start.equalsIgnoreCase("C")&& end.equalsIgnoreCase("A")){
//	    	System.out.println("left > top: A found");}
//	    else if (start.equalsIgnoreCase("C")&& end.equalsIgnoreCase("B")){
//	    	System.out.println("left > top > right: B");}
//	    else if (start.equalsIgnoreCase("C")&& end.equalsIgnoreCase("D")){
//	    	System.out.println("left: D found");}
//	    
//	    else if (start.equalsIgnoreCase("D")&& end.equalsIgnoreCase("D")){
//	    	System.out.println("D found");}
//	    else if (start.equalsIgnoreCase("D")&& end.equalsIgnoreCase("A")){
//	    	System.out.println("top > A found");}
//	    else if (start.equalsIgnoreCase("D")&& end.equalsIgnoreCase("B")){
//	    	System.out.println("top > right: B found");}
//	    else if (start.equalsIgnoreCase("D")&& end.equalsIgnoreCase("C")){
//	    	System.out.println("top > right > down: C found");}

	    
	    
	    
	    
	    
	    
	       
	    
	    
	    
	    
	  }
	}

	


