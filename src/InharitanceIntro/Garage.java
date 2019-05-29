package InharitanceIntro;

public class Garage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehhicle1 =new Vehicle();
		vehhicle1.drive();
		vehhicle1.stop();
		vehhicle1.make ="BMW";
		
		Car car1=new Car();
		
		
		car1.drive();
		car1.stop();
		car1.eccellerate();
		car1.make= "mercedence";
		
		Bus bus1= new Bus();
		
		
		bus1.stop();
		bus1.drive();
		bus1.make="ford";
		
		
		SportsCar sportsCar1 =new SportsCar();
		
		
		sportsCar1.drive();
		sportsCar1.stop();
		sportsCar1.eccellerate();
		sportsCar1.make= "corvette";
	
		
		
		

	}

}
