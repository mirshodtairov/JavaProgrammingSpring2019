package MethodsWithReturn;

public class CalculatorV2 {


	public static double calculatePls(double n1, double n2, char operator) {
		switch (operator) {
		case ('-'):
			return substruct(n1, n2);

		case ('+'):
			return add(n1, n2);
		case ('?'):
			return division(n1, n2);
		case ('*'):
			return muliplication(n1, n2);
		default :
			
			throw new RuntimeException("incorrect orerator"+operator);

		}
		
		

	}

	public static double add(double num1, double num2) {
		double result = num1 + num2;
		return result;
	}

	public static double substruct(double num1, double num2) {
		double result = num1 - num2;
		return result;
	}

	public static double division(double num1, double num2) {
		double result = num1 / num2;
		return result;
	}

	public static double muliplication(double num1, double num2) {
		double result = num1 * num2;
		return result;
	}
}
