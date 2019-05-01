package Day27;

import java.util.Arrays;

public class CopyOf {

	public static void main(String[] args) {
		double [] d1= {32.4,43.6,7.0};
		double [] d2= d1;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d2[1]=100.3;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d2[1]=d1[0]+d1[2];
		
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		double [] d3=Arrays.copyOf(d2,d2.length);
		System.out.println(Arrays.toString(d3));

	}

}
