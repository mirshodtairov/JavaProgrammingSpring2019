package Day46_StaticKeyword;

public class Vihicle {

	
	String type;//instance veriable , every object has its own type
	static int numberOfVeriables;//shared one central value
	
	
	public  static void vehicleInfo() {
	//	System.out.println(type); <-this is not gonna work coz its calling non static veriable;
		System.out.println(numberOfVeriables);
		int count = getNumberOfVehicle();// it is calling static method
		
	}
	
	public static int getNumberOfVehicle() {
		
		return numberOfVeriables;// this is working because it is calling from static
		
		
	}
	
	public String toString() {
		return "Vehicle type "+type+" | "+numberOfVeriables;
	}
	
	
	
}
