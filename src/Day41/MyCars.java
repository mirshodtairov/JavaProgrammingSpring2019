package Day41;

import Day31CustomMethodsPractice.drive;

public class MyCars {

	public static void main(String[] args) {
		Car car1= new Car();
		
		car1.make="Honda";
		car1.model= "Accord";
		car1.collor= "Grey";
		car1.cureentSpeed= 45;
		
		car1.printCarInfo();
		car1.showCurrentSpeed(55);
		
		Car car2 = new Car();
		car2.drive("Porche", "Panamera", "white");
		
		BMW bmw= new BMW();
		System.out.println(bmw.make);
		bmw.model="740i";
		
		bmw.showPrice();
		
		System.out.println("car Price "+ bmw.price);
		
		
		BMW bmw2 = new BMW();
		bmw2.model= "X3";
		bmw2.showPrice();
	     

	}

}
