package Day60_Polimorphism02;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

import Day59_Polimorphizm.Circle;
import Day59_Polimorphizm.Shape;
import Day59_Polimorphizm.Square;
import Day59_Polimorphizm.Triangle;

public class ShapesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Boolean b3 = new Boolean("abc");

         Boolean b4 = null;
         System.out.println(b3 + ":" + b4);
		Shape shape = new Triangle();
		shape.draw();
	    
		Shape [] shapes = {new Triangle(), new Square(), new Circle()};
		
//		Shape [] shapes2 = new Shape[3];
//		shapes[0]= new Triangle();
//		shapes[1]= new Circle();
//		shapes[2]= new Square();
//		
		
//		shapes[2].draw();
//		shapes2[1].draw();
		System.out.println("#####for each loop#####");
		
		for(Shape sh : shapes) {
			System.out.println(sh.getClass().getSimpleName());
			sh.draw();
		}
		
		ArrayList<Shape> shapesList = new ArrayList<>();
		shapesList.add(new Triangle());
		shapesList.add(new Circle());
		shapesList.add(new Square());
		shapesList.add(new Triangle());
		shapesList.add(new Circle());
		
		shapesList.get(0).draw();
		Shape sameShape = shapesList.get(1);
		sameShape.draw();
		
		
		System.out.println("For each loop");
		for (Shape shapeItem : shapesList) {
			System.out.println(shapeItem.getClass().getSimpleName().toUpperCase());
			shapeItem.draw();
			
		}
		
		System.out.println("for loop");
		for (int i = 0; i < shapesList.size(); i++) {
			
			System.out.println(shapesList.get(i).getClass().getSimpleName());
			shapesList.get(i).draw();
		}
		

	}

}
