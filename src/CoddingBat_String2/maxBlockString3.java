package CoddingBat_String2;

public class maxBlockString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbCCCCddBBBxx";
		System.out.println(max(str));

	}

	public static int max(String str) {
		int len= str.length();
		int counter = 0;
		int finalCounter = 1;

		
		  
		
		  if (len == 0)
		
		    return 0;

		
		for (int i = 0; i < len; i++) {
			
			if (i < len-1 && str.charAt(i) == str.charAt(i + 1)) 
				finalCounter++;
				

			else 
				finalCounter=1;
			

		
		if (finalCounter>counter) 
			counter=finalCounter;
		}
		return counter;

	}

}
