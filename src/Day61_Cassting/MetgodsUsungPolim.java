package Day61_Cassting;

import java.util.Scanner;

import Day43_Incapsulation.Tesla;
import Day49.TV;
import Day59_Polimorphizm.Shape;
import Day59_Polimorphizm.Square;
import Day59_Polimorphizm.Triangle;
import Day60_Polimorphism02.appleDevice;

public class MetgodsUsungPolim {

	public static void main(String[] args) {
		String str = "book";

		GiveMeAnyObject(new String("hi"));
		GiveMeAnyObject(new Scanner(System.in));
		GiveMeAnyObject(new Tesla());
		GiveMeAnyObject(new TV());
		GiveMeAnyObject(55);
		GiveMeAnyObject(false);
		
		returnShape("triangle");

	}

	// TODO Auto-generated method stub

	public static void purchase(appleDevice ap) {
		System.out.println("purchasing " + ap.getClass().getSimpleName());
	}

	public static void GiveMeAnyObject(Object obj) {
		System.out.println("you gave me " + obj.getClass().getSimpleName());

	}

	public static appleDevice buildAppleDev(appleDevice ad) {

		System.out.println(ad.getClass().getSimpleName());
		return ad;
	}
	
	
	public static Shape returnShape (String type) {
		if (type.equals("triangle")) {
			return new Triangle();
		}
		else if (type.equals("Square")) {
			return new Square();
			
		}else {
		return null;
		}
	}

}
