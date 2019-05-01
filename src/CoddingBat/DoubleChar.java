package CoddingBat;

public class DoubleChar {

	public static void main(String[] args) {
		String str= "the";
		String newStr="";
		for (int i = 0; i < str.length(); i++) {
			newStr+=str.substring(i,i+1)+str.substring(i,i+1);
		}
	System.out.println(newStr);

	}

}
