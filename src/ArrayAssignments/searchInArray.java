package ArrayAssignments;

public class searchInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] points = {23, 34 ,45, 65 ,23 ,4, 4, 3, 2312, 73};
		int lookfor=100;
		boolean found=false;
		for (int i = 0; i < points.length; i++) {
			if(points[i]==lookfor) {
				System.out.println("100 was found at index of "+i);
				found=true;
				break;
			}
			
		}
		if (found==false) {
			System.out.println(lookfor+" wasn't found");
		}

	}

}
