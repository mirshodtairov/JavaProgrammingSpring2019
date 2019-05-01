package CoddingBat;

public class repeatEnd {

	public static void main(String[] args) {
		String str= "hello";
		int n=2;
		for (int i = 0; i < n; i++) {
			System.out.print(str.substring(str.length()-n));
			
		}
	}

}
