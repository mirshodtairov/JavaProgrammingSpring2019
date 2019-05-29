package Inheritance_YouTube;

public class truck extends superCar {
	
	private String truckMake;
	private String truckEngine;
	private int truckSecKm;
	private int truckCapacity;
	
	
	
	@Override
	public String toString() {
		return "truck [truckMake=" + truckMake + ", truckEngine=" + truckEngine + ", truckSecKm=" + truckSecKm
				+ ", truckCapacity=" + truckCapacity + "]";
	}



	public String getTruckMake() {
		return truckMake;
	}



	public void setTruckMake(String truckMake) {
		this.truckMake = truckMake;
	}



	public String getTruckEngine() {
		return truckEngine;
	}



	public void setTruckEngine(String truckEngine) {
		this.truckEngine = truckEngine;
	}



	public int getTruckSecKm() {
		return truckSecKm;
	}



	public void setTruckSecKm(int truckSecKm) {
		this.truckSecKm = truckSecKm;
	}



	public int getTruckCapacity() {
		return truckCapacity;
	}



	public void setTruckCapacity(int truckCapacity) {
		this.truckCapacity = truckCapacity;
	}
	
	public void abilityToDrive() {
		System.out.println("This car drives not that fast");
	}
	public void abilityCarryWight() {
		System.out.println("Up to 5 tonns");
		super.abilityCarryWight();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
