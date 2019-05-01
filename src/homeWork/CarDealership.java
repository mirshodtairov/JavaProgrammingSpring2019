package homeWork;

import java.util.Scanner;

public class CarDealership {

	public static void main(String[] args) {
		double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		int zipcode;
		int age;
		int experiance;
		String eccidents;
		String validDriversLicennse;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the CountyFarm car insurance!");
		System.out.println("Enter your name:");
		name = scan.next();

		System.out.println("Do you have a US driver license?");
		validDriversLicennse = scan.next();
		if (validDriversLicennse.equalsIgnoreCase("NO")) {
			System.out.println("Invalid data!");
			System.exit(0);
		}
		System.out.println("Enter your zip code:");
		zipcode = scan.nextInt();

		if (zipcode == (20910) || zipcode == (20740)) {
			premium += 60;

		} else if (zipcode == (22102) || zipcode == (22103)) {
			premium += 30;

		} else
			premium += 50;

		System.out.println("Is this vehicle Owned, Financed, or Leased?");
		vehicleOwnership = scan.next();

		if (vehicleOwnership.equalsIgnoreCase("Owned")) {
			premium = premium + 10;
		} else if (vehicleOwnership.equalsIgnoreCase("Financed") || vehicleOwnership.equalsIgnoreCase("Leased")) {
			premium = premium + 20;

		}
		System.out.println("How is this vehicle primarily used?");
		vehicleUsage = scan.next();
		if (vehicleUsage.equalsIgnoreCase("Business")) {
			premium = premium + 50;
		} else if (vehicleUsage.equalsIgnoreCase("Pleasure")) {
			premium = premium + 10;
		} else if (vehicleUsage.equalsIgnoreCase("Commute")) {
			premium = premium + 20;
		}

		System.out.println("Days Driven To Work And/Or School");
		daysDrivenToWorkOrSchool = scan.nextInt();
		{

			premium = premium + daysDrivenToWorkOrSchool * 5;
		}

		System.out.println("Miles Driven To Work And/Or School");
		milesToWorkOrSchool = scan.nextInt();
		{
			premium = premium + milesToWorkOrSchool * 1;
		}
		System.out.println("How old are you?");
		age = scan.nextInt();
		if (age < 16) {
			System.out.println("Invalid data");
			{
				System.exit(0);
			}
		} else if (age == 16 || age == 17) {
			premium = premium * 20;

		} else if (age >= 18 && age <= 21) {
			premium = premium * 6;
		} else if (age > 21 && age < 25) {
			premium = premium * 2;
		}
		System.out.println("How many years you've been driving?");
		experiance = scan.nextInt();
		if (experiance > 0)
			premium = premium;
		else {
			premium = premium - (experiance * 5);
			System.out.println("Invalid data!");
			System.exit(0);
		}
		System.out.println("Have you had any accidents in the last 5 years?");
		eccidents = scan.next();
		if (eccidents.equalsIgnoreCase("Yes")) {
			System.out.println("How many?");
			accidentsAmount = scan.nextInt();
			premium = premium + accidentsAmount * 0.20;
		} else if (eccidents.equalsIgnoreCase("No")) {
			premium = premium;
		}
		System.out.println("Have you had continuous insurance for the past 12 months?");
		continuousInsurance = scan.next();
		if (continuousInsurance.equalsIgnoreCase("no")) {
			premium = premium * 2;
		} else if (continuousInsurance.equalsIgnoreCase("yes"))
			;
		{
			premium = premium;
		}

		System.out.println("What is the highest level of education you have completed?");
		education = scan.next();
		{
			if (education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("Bachelors")
					|| education.equalsIgnoreCase("Masters")) {
				premium = premium - (premium * 0.05);
			} else if (education.equalsIgnoreCase("Doctors")) {
				premium = premium - (premium * 0.10);

			} else if (education.equalsIgnoreCase("Less than High School")) {
				premium = premium + (premium * 0.05);

			}
			System.out.println("David, here's your quote!");
			System.out.println("Start Your Policy Today For: " + premium);

		}

	}

}
