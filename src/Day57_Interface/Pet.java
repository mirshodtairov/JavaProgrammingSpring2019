package Day57_Interface;

public interface Pet {
	
	boolean friendly=true;

	
	public abstract void keepAsPet();
	
	public default void play() {
		System.out.println("playing hide and seek with a pet");
	}
	public static void feed(String food) {
		System.out.println("feeding a pet with food");
	}
}
