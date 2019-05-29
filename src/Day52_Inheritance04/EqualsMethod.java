package Day52_Inheritance04;

public class EqualsMethod {

	public static void main(String[] args) {
		
		
		String str ="blue";
		String str1= "blue";
		System.out.println(str.equals(str1));
		Computer comuter1 = new Computer("Imac", "Gray");
		Computer comuter2 = new Computer("Imac", "Gray");
		System.out.println(comuter1==comuter2);
		System.out.println(comuter1.equals(comuter2));
		
		Computer comuter3 = comuter2;
		System.out.println(comuter3==comuter2);
		System.out.println(comuter3.equals(comuter2));
		
		
		
		
	
	}

}
