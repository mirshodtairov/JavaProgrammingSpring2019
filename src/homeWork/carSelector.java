package homeWork;

import java.util.Scanner;

public class carSelector {
   
	        
    
	public static void main(String[] args) {
		    int carType;
			double averagePrice;
			String carOptions;
			
		System.out.println("Which type of car you are interested in?");
		Scanner scan = new Scanner(System.in);
		carType = scan.nextInt();
		
		
		switch (carType) {
		case 1:
			averagePrice=33000;
			carOptions="American";
			System.out.println("Ford, Dodge, Tesla, Chevrolet, Lincoln");
			System.out.println("Car Option "+carOptions);
			System.out.println("Everage Price: "+averagePrice);
			break;
		case 2:
			averagePrice=32000;
			carOptions="Japanies";
			System.out.println("Toyota, Mitsubisi, Honda, Subaru, Mazda");
			System.out.println("Car Option: "+carOptions);
			System.out.println("Everage Price: "+averagePrice);
			break;
		case 3:
			averagePrice=55000;
			carOptions="german";
			System.out.println("Bmw, VW, Audi, Mercedes, Porsche");
			System.out.println("Car Option "+carOptions);
			System.out.println("Everage Price: "+averagePrice);
			break;
		case 4:
			averagePrice=75000;
			carOptions="italian";
			System.out.println("Alfa Romeo, Ferrari, Lamborghini, Fiat");
			System.out.println("Car Option "+carOptions);
			System.out.println("Everage Price: "+averagePrice);
			break;
		case 5:
			averagePrice=20000;
			carOptions="korean";
			System.out.println("Kia, Hyundai, Daewoo");
			System.out.println("Car Option "+carOptions);
			System.out.println("Everage Price: "+averagePrice);
			break;
		}
		
		
		

	}

}
