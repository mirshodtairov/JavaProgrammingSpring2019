package CoddingBat;

public class DoNotPrintCharLeftAndRightToStar {

	public static void main(String[] args) {
		
		System.out.println(starOut("jdfgh*nand"));

	}
	public static String starOut(String str) {
		
		   String strfinal="";
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '*' || (i > 0 && str.charAt(i-1) == '*')) continue;
				if (i < str.length()-1 && str.charAt(i+1) == '*') continue;
		       strfinal = strfinal + str.charAt(i);
				return strfinal;
				
			}
			
		    return str;
		}	
	
	
	}


