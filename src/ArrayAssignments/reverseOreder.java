package ArrayAssignments;

public class reverseOreder {

	public static void main(String[] args) {
		int [] points = {23, 34 ,45, 65 ,23 ,4, 4, 3, 2312, 73};
		for (int i=points.length-1; i>=0; i--) {
			
		 
			System.out.print(points[i]);
		}
		
		System.out.println("+++++++++++++++++++++++++");
		int j= points.length-1;
		while (j>=0) {
			
			System.out.print(points[j]);
			j--;
		}

	}


}