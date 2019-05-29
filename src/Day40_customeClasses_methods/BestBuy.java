package Day40_customeClasses_methods;

public class BestBuy {

	public static void main(String[] args) {
		CellPhone cell1 = new CellPhone();
//		System.out.println(cell1.brand);
//		
//		System.out.println(cell1.ScreenSize);
//		
//		System.out.println(cell1.collor);
		cell1.brand="Nokia";
		cell1.ScreenSize=2.0;
		cell1.collor="grey";
		cell1.price= 76.16;
		
		System.out.println(cell1.brand);
		System.out.println(cell1.ScreenSize);
		System.out.println(cell1.collor);
		System.out.println(cell1.price);
		
		CellPhone cell2= new CellPhone();
		cell2.brand= "Siemens";
		cell2.ScreenSize= 1.5;
		cell2.collor="black";
		cell2.price= 39.22;
		
		System.out.println(cell2.brand);
		System.out.println(cell2.ScreenSize);
		System.out.println(cell2.collor);
		System.out.println(cell2.price);
		
		
		System.out.println("Calling method");
		cell1.call();
		cell1.message();
		
		
		cell2.call();
		cell2.message();
		cell2.takePhoto();
		

	}

}
