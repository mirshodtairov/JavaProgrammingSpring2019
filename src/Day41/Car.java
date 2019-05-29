package Day41;

public class Car {

	String make;
	String model;
	String collor;
	int cureentSpeed;

	String make1;
	String model1;
	String collor1;

	public void Car() {
		this.make1 = make1;
		this.model1 = model1;
		this.collor1 = collor1;

	}

	public void drive(String make1, String model1, String collor1) {
		System.out.println(model1 + " is driving fast");

	}

	public void printCarInfo() {
		System.out.println("car make [" + make + "], model [" + model + "] ,collor [" + collor + "], current speed ["
				+ cureentSpeed + "]");

	}

	public void showCurrentSpeed(int speedLimit) {

		if (cureentSpeed >= 55) {
			System.out.println("Slow Down, you are over the speed limit");
		} else {
			System.out.println("You are driving under speed limit ");
		}

	}
	
	public void accellerate(int phm) {
		cureentSpeed+=phm;
		System.out.println(cureentSpeed);
		
		
	}

}
