package CustomMethod;

import day11.calulator;
import MethodsWithReturn.*;

public class Calculations {

	public static void main(String[] args) {
		Calculator.add(1000, 3020);
		Calculator.division(123, 764);
		Calculator.substruct(45, 789);
		Calculator.muliplication(12,345);
		
	    double mathresult=(CalculatorV2.add(2.0, 4.0));
	    
	    if (mathresult > 7.0) {
	    	System.out.println("icorrect answer");
	    }else if (mathresult<7.0) {
	    	System.out.println("incorect answer");
	    }else {
	    	System.out.println("all good, you are right");
	    }
		System.out.println(CalculatorV2.calculatePls(44, 22, '-'));
		

	}
	
	

}
