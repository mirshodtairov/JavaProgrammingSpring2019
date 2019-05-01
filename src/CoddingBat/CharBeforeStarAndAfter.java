package CoddingBat;

public class CharBeforeStarAndAfter {

	public static void main(String[] args) {
		String str="*xa*a*b";
		
		for (int i = 0; i < str.length()-1; i++) {
			if (str.charAt(i)=='*' && str.charAt(i-1)!=str.charAt(i+1)) {
				System.out.println(false);
			}
			
			
		}System.out.println(true);
		

	}

}
