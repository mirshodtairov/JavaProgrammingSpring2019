package Polimorphism_Tim;

class cartoon {

	private String name;

	public cartoon(String name) {
		this.name = name;
	}

	public String plot() {
		return "No plot here";

	}
}

class nemo extends cartoon {

	public nemo() {
		super("nemo");

	}

	public String plot() {
		return "Nemo triying to find and resque his father";

	}

}
class coco extends cartoon{
	public coco() {
		super("Coco");
	}
	public String plot() {
		return "kid is trying to become musician ";
	}
}
class LionKing extends cartoon{
	
	public LionKing() {
		super("Lion king"); 
	}
	public String plot() {
		return "Simba trying to get kingdom back";
		
	}
	
}

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
