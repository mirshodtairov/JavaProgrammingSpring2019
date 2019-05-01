package RplIt;

public class limitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	 public static String limit(String text, int maxLength) {
		 if (!text.contains(" ") && text.length()>=maxLength) {
			 String temp=text.substring(0,maxLength);
			 return temp;
		 }else if (text.contains(" ") && text.length()>=maxLength) {
			 String [] arr=text.split(" ");
			 for (int i = 0; i < arr.length; i++) {
				String make= arr[i].substring(0,maxLength);
				return make;
			}
		 }
		return text;
		
		
	 }

}
