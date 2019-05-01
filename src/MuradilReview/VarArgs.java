package MuradilReview;

public class VarArgs {

	public static void main(String[] args) {
		sum(10,20);
		sumAll(3,4,65,8);
		
		shoppinglist("Tomatoes", "potatoes", "Cucumbers");
		shoppinglist("xbos", "mac", "headphones");


	}
	public static void sum(int n1, int n2) {
		System.out.println(n1+n2);
	}
	public static void  sumAll(int... nums) {
		System.out.println("Number of Input "+nums.length);
		int sum=0;
		for (int i : nums) {
			sum+=i;
			
		}
		System.out.println(sum);
		
	}
	public static void shoppinglist(String...products) {
		String sl="";
		for (String string : products) {
			sl=sl+string+" ";
		}
		
		
		System.out.println(sl);
		
	}

}
