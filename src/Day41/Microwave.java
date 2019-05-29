package Day41;

public class Microwave {
	
	
	String brand;
	boolean isOn;
	  
	
	public void turnOn() {
		
		if(isOn==true)
		System.out.println("It is alreasy on");
		
	}
	public void urnOff() {
		if(isOn==false)
		System.out.println("Its already off");
		
	}
	public void heat(String food) {
		if(isOn==true) {
		System.out.println("heating the pizza");}
		else {
			System.out.println("Microwave is off, Can not heat the pizza");
		}
		
	
		
	}
	
	
			
		
		
	}
	

