package Inheritance_YouTube;

public class superCar {

	private String make;
	private String engine;
	private int secKm;
	private int capacity;

	@Override
	public String toString() {
		return "superCar [make=" + make + ", angine=" + engine + ", secKm=" + secKm + ", capacity=" + capacity + "]";
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		if(make.equalsIgnoreCase("Ferrari")||make.equalsIgnoreCase("lamborgini")){
				this.make = make;
				System.out.println("im buying  it");
		}else {
			System.out.println("Ill wait and buy it later");
		}
	
	}

	public String getAngine() {
		return engine;
	}

	public void setAngine(String engine) {
		this.engine = engine;
	}

	public int getSecKm() {
		return secKm;
	}

	public void setSecKm(int secKm) {
		this.secKm = secKm;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void abilityToDrive() {
		System.out.println("Drives very fast");

	}
	
	public void abilityCarryWight() {
		System.out.println("It is super car, it does not take waight beside passangers");

	}
	
	public superCar(){
		
	}

	public superCar(String make, String engine, int secKm, int capacity) {
		this.make = make;
		this.engine= engine;
		this.secKm=secKm;
		this.capacity=capacity;


	}

}
