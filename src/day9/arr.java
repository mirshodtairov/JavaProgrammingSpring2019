package day9;

public class arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}  public static String[] reverse(String[] arr) {
		for (int i = 0; i < arr.length/2; i++) {
			String tepm= arr[i];
			arr[i]= arr[arr.length-1-i];
			arr[arr.length-1-i]=tepm;
		}
		
		return arr;
	}

}
