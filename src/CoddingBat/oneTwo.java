package CoddingBat;

public class oneTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static String oneTwo(String str) {
		String make="";
		if (str.length()%3!=0 && str.length()>3) {
			make=str.substring(1, 3)+str.charAt(0);
			}
		return make;
		}
		  
	}


