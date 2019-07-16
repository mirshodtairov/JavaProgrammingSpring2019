package Day59_Polimorphizm;

public class shapeTests {

	public static void main(String[] args) {
		Shape sh = new Shape();
		sh.draw();
		
		Shape c = new Circle();
		c.draw();
		
		Shape tr= new Triangle();
		tr.draw();
		
		Shape sq = new Square();
		sq.draw();

	}

}
