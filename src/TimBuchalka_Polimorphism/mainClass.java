package TimBuchalka_Polimorphism;

public class mainClass {
	
	public static void main(String[] args) {
		Car car = new Car(6, "base car");
		car.Eccelerate();
		car.Break();
		car.StartEngie();
		
		Car bmw = new BMW(6, "M5");
		bmw.Eccelerate();
		bmw.Break();
		bmw.StartEngie();
		
		Car honda = new Honda(6, "ACCORD");
		honda.Eccelerate();
		honda.Break();
		honda.StartEngie();
		
		Car A_M = new AstonMartin(6, "VAMTAGE");
		 A_M .Eccelerate();
		 A_M .Break();
		 A_M .StartEngie();
		
	}

}
