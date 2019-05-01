package CoddingBat;

public class endOfOther {

	public static void main(String[] args) {
		System.out.println(endOther( "abdhgjhjk","Hiabc"));

	}
	public static boolean endOther(String a, String b) {
		if (a.length()>b.length()) {
			if (a.substring(a.length()-b.length()).equalsIgnoreCase(b)) {
				return true;
			}
			return false;
			
		}else if  (a.length()<b.length()) {
			if (b.substring(b.length()-a.length()).equalsIgnoreCase(a)) {
				return true; 
			}
			return false;
		}
		return false;
		
	}

}
