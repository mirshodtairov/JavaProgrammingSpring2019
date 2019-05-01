package CoddingBat;

public class commonEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] d = {1, 2, 3};
		int [] c = {4, 3, 4};
		System.out.println(commonEnd(d, c));

	}
	public static boolean commonEnd(int[] a, int[] b) {
		  if (a[0]==b[0] || a[a.length-1] == b[b.length-1]) {
			  return true; 
		  }
		  return false;
	}


}
