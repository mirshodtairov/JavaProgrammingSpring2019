package Day60_Polimorphism02;

public abstract class appleDevice {
	 
			
	
	
	public abstract void use();

}




class Mac extends appleDevice {
	public void use() {
		System.out.println("Use forYouTube");
	}

	public void code() {
		System.out.println("coddddinnngggg");
	}

}




class Ipad extends appleDevice {
	@Override
	public void use() {
		System.out.println("U can used it for music ");

	}

	public void draw() {
		System.out.println("Darwwwwing ");
	}

}





class AppleWatch extends appleDevice {

	@Override
	public void use() {
		System.out.println("using AppleDevice");
	}
	public void call() {
		System.out.println("Calling");
	}
	
	

}
