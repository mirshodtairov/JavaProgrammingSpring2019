package Day42CustomClasses_Incapsulation;

import java.util.*;

import day32MethodsWithReturn.ArrysParametr;

public class DSWShoesStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shoes shoes1 = new Shoes();
		shoes1.setShoesData("ALDO", 6.5);
		System.out.println(shoes1.getShoesData());

		Shoes shoes2 = new Shoes();
		shoes2.setShoesData("Eddie Bower", 10.5);
		System.out.println(shoes2.getShoesData());

		Shoes shoes3 = new Shoes();
		shoes3.setShoesData("Slalmander", 11.5);
		System.out.println(shoes3.getShoesData());

		Shoes[] shoesArray = new Shoes[3];
		shoesArray[0] = shoes1;
		shoesArray[1] = shoes2;
		shoesArray[2] = shoes3;

		shoesArray[0].getShoesData();
		shoesArray[1].getShoesData();
		shoesArray[2].getShoesData();
		System.out.println(shoesArray[0].brand);
		System.out.println(shoesArray[1].brand);
		System.out.println(shoesArray[2].brand);

		ArrayList<Shoes> myShoes = new ArrayList<>();
		myShoes.add(shoes1);
		myShoes.add(shoes2);
		myShoes.add(shoes3);

		System.out.println(myShoes.get(0).getShoesData());
		System.out.println(myShoes.get(1).getShoesData());
		System.out.println(myShoes.get(2).getShoesData());

		System.out.println(myShoes.get(0).size);
		System.out.println(myShoes.get(1).size);
		System.out.println(myShoes.get(2).size);

		Shoes SH = new Shoes();
		SH = myShoes.get(0);
		System.out.println(SH.getShoesData());

		for (Shoes shoeOfEachLoop : myShoes) {
			System.out.println(shoeOfEachLoop.getShoesData());

		}

		for (Shoes shoes : myShoes) {
			if (shoes.size > 7.0) {
				System.out.println(shoes.brand);
			}
		}

	}

}
