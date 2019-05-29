package Day42CustomClasses_Incapsulation;

import java.util.*;

public class StringShooesToOBject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "Bruno Mogli, 9.5";
		String[] arrdata = data.split(",");
		Shoes shoes = new Shoes();
		shoes.setShoesData(arrdata[0], Double.parseDouble(arrdata[1]));
		shoes.brand = arrdata[0];
		shoes.size =  Double.parseDouble(arrdata[1]);
		System.out.println(shoes.getShoesData());
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Whats shoes brand?");
		String brand = scan.next();
		System.out.println("whats your size?");
		double size= scan.nextDouble();
		
		Shoes myShoesmy= new Shoes();
		myShoesmy.setShoesData(brand, size);
		System.out.println(myShoesmy.getShoesData());
		

	}

}
