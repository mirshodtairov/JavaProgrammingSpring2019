package ReplitInterface;

import java.util.Arrays;

public class MultiplicationTable implements TableGenerator {
	
	


	
	
	
	
	@Override
	public int[] generateTable(int value, int numberOfEntries) {
		int a= numberOfEntries;
		int [] arr = new int[a]; 
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=k;
			k+=value;
			
		}
	     return arr;
	}

	
	
	
	
	
	@Override
	public boolean checkTable(int value, int[] tableToTest) {
		int k =0;
		
		for (int i = 0; i < tableToTest.length; i++) {
			if (tableToTest[i]==k) {
				k+=value;
				return true;
				
			}
		}
		return false;
	}

}
