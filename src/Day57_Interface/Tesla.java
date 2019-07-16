package Day57_Interface;

public class Tesla extends Vehicle implements Electric {
	
	public void charge() {
		System.out.println("Tesla is charging at charging station");
	}

}
