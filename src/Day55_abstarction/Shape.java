package Day55_abstarction;

public abstract class Shape {
	

	String name;
	double area;

	public abstract double calculateArea();

	public abstract void draw();

	public Shape(String name) {
		this.name = name;

	}

}
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

class Circle extends Shape {

	public double radius;

	public Circle() {
		super("Circle");

	}

	public Circle(double radius) {
		super("Circle");
		this.radius = radius;

	}

	@Override
	public double calculateArea() {
		double s= Math.PI*Math.pow(radius, 2);
		return s;
	}

	@Override
	public void draw() {
		System.out.println("  ***  \n" + 
				" *   * \n" + 
				"*     *\n" + 
				"*     *\n" + 
				"*     *\n" + 
				" *   * \n" + 
				"  ***");
	
	}

}

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@	

class Triangle extends Shape {
	double length1;
	double length2;
	double length3;

	public Triangle(double length1, double length2, double length3) {
		super("Triangle");
		this.length1=length1;
		this.length2=length2;
		this.length3=length3;
		
	}

	@Override
	public double calculateArea() {
		
		double p = (length1 + length2 + length3)/2;
		return Math.sqrt(p*(p-length1)*(p-length2)*(p-length3));
	}

	@Override
	public void draw() {
		System.out.println(
				"     *\n" + 
				"    ***\n" + 
				"   *****\n" + 
				"  *******\n" + 
				" *********");
	}

}

/*
 * 1,Create a Shape abstract lclass 2,create instance fields name, area;
 * 3,create 2 abstract method as below : calculateArea() return double, no arg
 * draw() void 4,create one constructor that set name-value
 * 
 * 5,Create Circle and Triangle Concrete class of Shape
 * 
 * 5.1,create no arg constructor and call super class's one arg constructor
 * 
 * for Circle add 1 arg to set radius,Trial 3 args set length
 * 
 * 6,In Circle class add radius field.
 * 
 * 
 * and use this field to calculate your area in your calculate are method 7,in
 * Triangle class add leng1,leng2,leng3 and calculate your area according to the
 * each side of triangle. 9, Implement the abstract methods in both class to
 * provide detail
 */
