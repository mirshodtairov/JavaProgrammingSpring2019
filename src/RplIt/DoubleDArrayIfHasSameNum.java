package RplIt;

import java.util.Arrays;

public class DoubleDArrayIfHasSameNum {

	public static void main(String[] args) {
		
		int arr[][]= {{23,54,46,2,52},
				     {43,53,6,2,86,2},
				     {3,53,6567,233,3,9,3}};
		int counter=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length-1; j++) {
				for(int x=j+1; x<arr[i].length; x++) {
					int temp =arr[i][j];
					if(temp==arr[i][x]) {
						counter++;
						break;
					}
				}
		
		}
			
	
		}
		System.out.println(counter);

	}

}
