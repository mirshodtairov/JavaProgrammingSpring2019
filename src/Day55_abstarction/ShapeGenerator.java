package Day55_abstarction;

public class ShapeGenerator {

	public static void main(String[] args) {
		Circle cir= new Circle(3.4);
		cir.draw();
		System.out.println(cir.calculateArea());
		
		Triangle tr = new Triangle(5,5,5);
		System.out.println(tr.calculateArea());
		tr.draw();
	}

}
