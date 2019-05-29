package Day42CustomClasses_Incapsulation;
import java.util.*;
public class Starbucks {

	public static void main(String[] args) {
		String[]adv = new String[7];
		System.out.println(adv[0]);
		
		coffee [] cofeeArray= new coffee[2]; 
		System.out.println(cofeeArray[0]);
		cofeeArray[0]=new coffee();
		cofeeArray[0].setCoffeeInfo("Expresso", "tall", 2.55, 7);
		cofeeArray[0].getCoffeeInfo();
		
		coffee latee = new coffee();
		latee.setCoffeeInfo("CAFE LATEE", "garnde", 3.4, 190);
		cofeeArray[1]=latee;

	}

}
