package Day41;

public class Kitchen {
	
	public static void main(String[] args) {
		Microwave mic= new Microwave();
		
		mic.brand="BOSH";
		mic.isOn=true;
		mic.turnOn();
		mic.heat("pizza with shrooms");
		
	}
}
