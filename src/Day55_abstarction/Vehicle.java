package Day55_abstarction;

public abstract class Vehicle {
	private int wheels;
	private double type;
	private String name;
	private String PowerSource;
	

	public Vehicle(int wheels, double type, String name, String powerSource) {
		this.wheels = wheels;
		this.type = type;
		this.name = name;
		PowerSource = powerSource;
	}
	
	public abstract void move();

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public double getType() {
		return type;
	}

	public void setType(double type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPowerSource() {
		return PowerSource;
	}

	public void setPowerSource(String powerSource) {
		PowerSource = powerSource;
	}

}


	
	
	

