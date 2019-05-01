package homeWork;

import java.util.Scanner;

public class Colculator {
	public static void main(String[] args) {
		int numberofpeople;
		double totalnumoftip;
		double totalaountofbill;
		double grandtotal;
		double totalperperson;
		double tipperperson;
		String quality, yesorno;
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Spit: ");
		yesorno=scan.next();
		System.out.println("number of people: ");
		numberofpeople = scan.nextInt();
		System.out.println("check amount: ");
		totalaountofbill = scan.nextDouble();
		System.out.println("service quality: ");
		quality = scan.next();
		
		

		switch (numberofpeople) {
		case 1:
			System.out.println("number of people entered: &");
			break;
		case 2:
			System.out.println("number of people entered: &&");
			break;
		case 3:
			System.out.println("number of people entered: &&&");
			break;
		case 4:
			System.out.println("number of people entered: &&&&");
			break;
		case 5:
			System.out.println("number of people entered: &&&&&");
			break;
		case 6:
			System.out.println("number of people entered: &&&&&&");
			break;
		case 7:
			System.out.println("number of people entered: &&&&&&&");
			break;
		case 8:
			System.out.println("number of people entered: &&&&&&&&");
			break;
		case 9:
			System.out.println("number of people entered: &&&&&&&&&");
			break;
		case 10:
			System.out.println("number of people entered: &&&&&&&&&&");
			break;
		}
		if (quality.equalsIgnoreCase("Poor")) {
			grandtotal=totalaountofbill*0.05+totalaountofbill;
			totalnumoftip=totalaountofbill*0.05;
			totalperperson=grandtotal/numberofpeople;
			tipperperson=totalnumoftip/numberofpeople;
			System.out.println("Total to pay: "+grandtotal);
			System.out.println("Total tip: "+totalnumoftip);
			System.out.println("Total per person: "+totalperperson);
			System.out.println("Tip per person: "+tipperperson);
			
		} else if (quality.equalsIgnoreCase("Fair")) {
			grandtotal=totalaountofbill*0.10+totalaountofbill;
			totalnumoftip=totalaountofbill*0.10;
			totalperperson=grandtotal/numberofpeople;
			tipperperson=totalnumoftip/numberofpeople;
			System.out.println("Total to pay: "+grandtotal);
			System.out.println("Total tip: "+totalnumoftip);
			System.out.println("Total per person: "+totalperperson);
			System.out.println("Tip per person: "+tipperperson);
			
		} else if (quality.equalsIgnoreCase("good")) {
			grandtotal=totalaountofbill*0.15+totalaountofbill;
			totalnumoftip=totalaountofbill*0.15;
			totalperperson=grandtotal/numberofpeople;
			tipperperson=totalnumoftip/numberofpeople;
			System.out.println("Total to pay: "+grandtotal);
			System.out.println("Total tip: "+totalnumoftip);
			System.out.println("Total per person: "+totalperperson);
			System.out.println("Tip per person: "+tipperperson);
			
		} else if (quality.equalsIgnoreCase("great")) {
			grandtotal=totalaountofbill*0.20+totalaountofbill;
			totalnumoftip=totalaountofbill*0.20;
			totalperperson=grandtotal/numberofpeople;
			tipperperson=totalnumoftip/numberofpeople;
			System.out.println("Total to pay: "+grandtotal);
			System.out.println("Total tip: "+totalnumoftip);
			System.out.println("Total per person: "+totalperperson);
			System.out.println("Tip per person: "+tipperperson);
			
			
		} else if (quality.equalsIgnoreCase("excellent")) {
			grandtotal=totalaountofbill*0.25+totalaountofbill;
			totalnumoftip=totalaountofbill*0.25;
			totalperperson=grandtotal/numberofpeople;
			tipperperson=totalnumoftip/numberofpeople;
			System.out.println("Total to pay: "+grandtotal);
			System.out.println("Total tip: "+totalnumoftip);
			System.out.println("Total per person: "+totalperperson);
			System.out.println("Tip per person: "+tipperperson);
		}
		
		

	}

}
