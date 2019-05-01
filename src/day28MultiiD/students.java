package day28MultiiD;

public class students {

	public static void main(String[] args) {
		int[][] students = { { 4, 5, 6 }, { 12, 5, 7 }, { 23, 56, 12, 3 } };
		for (int[] group : students) {
			for (int id : group) {
				System.out.print(id + ",");
			}
			System.out.println();

		}
		
		int [][] nums=   {{34,56324,56323},
		                  {32,45,68,98},
		                  {4,65,85,90,2},
		                  {2,3,65},
		                  {65,98,6,4345,35643,56}};
		for (int i =0; i <nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j]+" ");
				
				
			}
			System.out.println();
		}
		
		
	}

}
