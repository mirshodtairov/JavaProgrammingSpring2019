package Day60_Polimorphism02;

import Day59_Polimorphizm.Circle;
import Day59_Polimorphizm.Shape;
import Day59_Polimorphizm.Square;
import Day59_Polimorphizm.Triangle;

public class InstatnceOfOperator {
	public static void main(String[] args) {
		Shape shape = new Triangle();
		
		System.out.println(shape.getClass().getSimpleName());
		System.out.println(shape.getClass().getName());
		if (shape.getClass().getSimpleName().equals("Triangle")) {
			System.out.println("It is triangle");
		}else if (shape.getClass().getSimpleName().equals("Square")) {
			System.out.println("It is square");
		}else if (shape.getClass().getSimpleName().equals("Circle")) {
			System.out.println("It is circle");
		}
		
		System.out.println(shape instanceof Square);
		System.out.println(shape instanceof Circle);
		System.out.println(shape instanceof Triangle);
		
		System.out.println(shape instanceof Shape);
		System.out.println(shape instanceof Object);
		
		if (shape instanceof Square) {
			shape.draw();
			System.out.println("It is square");
		}else if (shape  instanceof Triangle) {
			shape.draw();
			System.out.println("It is Triangle");
		}else if (shape instanceof Circle) {
			shape.draw();
			System.out.println("It is circle");
		}
		Shape [] shapes = {new Triangle(), new Triangle(),new Circle(), new Square()};
		int circle = 0, square= 0, trianges=0;
		for (Shape shapesssss : shapes) {
			
			if (shapesssss instanceof Circle) {
				circle++;
				
				
			}
			else if(shapesssss instanceof Square) {
				square++;
				
			}
			else if (shapesssss instanceof Triangle) {
				trianges++;
				
			}
		}
		System.out.println("Number of Circles "+circle);
		System.out.println("Number of Square "+square);
		System.out.println("Number of Triangles "+trianges);
		
	}

}
