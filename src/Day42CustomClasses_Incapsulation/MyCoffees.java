package Day42CustomClasses_Incapsulation;

public class MyCoffees {

	public static void main(String[] args) {
       coffee coffee1 = new coffee();
		
		coffee1.name = "Iced caramel maciato";
		coffee1.calories = 250;
		coffee1.size = "Grande";
		coffee1.price = 4.75;
		
		coffee1.getCoffeeInfo();
		
		coffee coffee2 = new coffee();
		coffee2.setName("Java chip");
		coffee2.size = "Venti";
		coffee2.price = 5.95;
		coffee2.calories = 600;
		
		coffee2.getCoffeeInfo();
	
		coffee coffee3 = new coffee() ;
		coffee3.setName("Iced coffee");
		coffee3.setSize("Tall");
		coffee3.setPrice(2.45);
		coffee3.setCalories(60);
		
		System.out.println("Coffee3 name: "+coffee3.name);
		coffee3.getCoffeeInfo();
		
		coffee coffee4=new coffee();
		coffee4.setCoffeeInfo("Falt White", "tall", 3.95, 170);
		coffee4.getCoffeeInfo();

	}

}
