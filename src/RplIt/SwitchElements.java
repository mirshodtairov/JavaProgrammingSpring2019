package RplIt;

import java.util.Arrays;

public class SwitchElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] www = {1,2,3,4};
		System.out.println(Arrays.toString(do_switch(www)));

	}

	public static int[] do_switch(int[] i) {

		int[] r = new int[i.length];
		for (int j = 1; j < r.length - 1; j++) {
			r[j] = i[j];

		}
		r[0] = i[i.length - 1];
		r[r.length - 1] = i[0];
		return r;

	}

}
