package day32MethodsWithReturn;

public class methodWithReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(giveMe10$());
		int num=giveMe10$();
		System.out.println(num);
		System.out.println(givemeyourName("mirshod"));
		

	}
	public static int giveMe10$() {
		return 10;
	}
	public static String givemeyourName(String name) {
		return name;
	}

}
