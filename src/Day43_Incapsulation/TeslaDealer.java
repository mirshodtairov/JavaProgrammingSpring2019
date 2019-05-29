package Day43_Incapsulation;

public class TeslaDealer {

	public static void main(String[] args) {

		Tesla tesla = new Tesla();
		tesla.setModel("ROADSTER");
		tesla.setRange(310);
		tesla.setZeroTo60(3.2);
		tesla.setPrice(51450.0);
		tesla.setSelfDriving(true);
		// tesla.isValidModel("camry");
		Tesla myTesla = new Tesla();

		myTesla.setTeslaInfo("ROADSTER", 620, 1.9, 250000, true);
		System.out.println(myTesla.toString());

		if (tesla.getZeroTo60() > myTesla.getZeroTo60()) {
			System.out.println("Faster model: " + myTesla.getModel());

		} else {
			System.out.println(tesla.getModel() + " Faster");
		}

		System.out.println("Tesla " + tesla.getModel());
		System.out.println("Tesla " + tesla.getRange());
		System.out.println("Tesla " + tesla.getPrice());
		System.out.println("Tesla " + tesla.getZeroTo60());
		System.out.println("Tesla " + tesla.isSelfDriving());

		System.out.println(tesla);
		System.out.println(tesla.toString());
		
		buy(myTesla);
		buy(tesla);
		System.out.println(testDrive("Model x"));

	}public static Tesla testDrive(String model) {
		//
		System.out.println("Hi, i would like to test drive "+model);
		System.out.println("Sure, let me build the object");
		Tesla tsla = new Tesla();
		tsla.setTeslaInfo("Model x", 310, 2.5, 95000, false);
		return tsla;}
	
	public static void buy(Tesla car) {
		System.out.println("purchasing " + car.toString());

	}
	
	
		
	



}
