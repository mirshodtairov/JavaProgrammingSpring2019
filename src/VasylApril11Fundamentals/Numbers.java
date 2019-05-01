package VasylApril11Fundamentals;

public class Numbers {

	public static void main(String[] args) {
		int[] numbers = {421, 235, 435, 64, 547 , 63, 54, 845, 4};
		System.out.println(findMin(numbers));
		System.out.println(findMax(numbers));

	}
	public static int findMin(int [] arr) {
		int min = arr[0];
		for (int i:arr) {
			if ( min > i) {
				min=i;
			}
		}
		return min;
		
	}
	public static int findMax(int [] arr){
		int max=arr[0];
		for (int j : arr) {
			if (max < j) {
				max=j;
			}
			
		}
		return max;
	}

}
