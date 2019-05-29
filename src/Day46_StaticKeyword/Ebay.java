package Day46_StaticKeyword;

public class Ebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cm1 = new Customer("Abdalah Aleise ", "AbdallahAlies@gmail.com");
		Customer cm2 = new Customer("Adilet Kirgiz ", "AdiletKirgizs@tahoo.com");
		Customer cm3 = new Customer("Anastasia Zasibna", "Anastasia@outlook.com ");
		
		
		System.out.println(cm3.count);
		
		
		System.out.println(Customer.count);
		
		Customer cm4 = new Customer("Burac Ucal", "BuracYcal@yahoo.com ");
		System.out.println(Customer.count);
		
		cm1.count=10;
		cm2.count=10;
		
		System.out.println(cm1.count);
		System.out.println(Customer.count);
	}

}
