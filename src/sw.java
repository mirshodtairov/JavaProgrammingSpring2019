
public class sw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static int[] doSwitch(int [] arr) {
		
		
			int temp=arr[0];
			
			arr[0]=arr[arr.length-1];
			arr[arr.length-1]=temp;
			
		
		return arr;
		
	}

}
