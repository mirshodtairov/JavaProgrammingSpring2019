package CoddingBat;

public class XYbalace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(xyBalance(""));

	}
	
	public static boolean xyBalance(String str) {
		int counter=0;
	  	boolean check=false;
	  	if (str.length()==0 || (!str.contains("x"))) {
	  		check=false;
	  		
	  	}
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i)=='x') {
					counter=i;
					
					
				}
				
			}
		
			for (int j = counter; j < str.length(); j++) {
				if (str.charAt(j)=='y') {
					check =true;
				}
				
				
			}
			return check;
		}

}