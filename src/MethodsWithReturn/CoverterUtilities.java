package MethodsWithReturn;

import day11.calulator;

public class CoverterUtilities {

	public static void main(String[] args) {
		System.out.println(Miles2KM(55.0));
		double milevalue = Miles2KM(10);
		System.out.println(milevalue);
		if (Miles2KM(10) > 7) {
			System.out.println("Slow down");
		} else {
			System.out.println("drive faster");
		}
		System.out.println(Miles2KMV2(40));
		System.out.println(Pharenhiet2C(75));
		
		
		
		
		
		

	}

	public static double Miles2KM(double miles) {
		double miles1 = miles / 1.60934;
		return miles1;
	}

	public static double Miles2KMV2(double miles) {
		return CalculatorV2.muliplication(miles, 1.60934);

	}

	public static int Pharenhiet2C(int phar) {
		return (phar - 32) * 5 / 9;

	}
}
