package Day33;

import RplIt.custumPlusMethod;


public class CuclcTest {

	public static void main(String[] args) {
		System.out.println(CustomReturnMethod.add2(32,45));
		System.out.println(CustomReturnMethod.multiply(3, 5));
		System.out.println(CustomReturnMethod.minus(9, 56));
		
		
		int addResult=CustomReturnMethod.add2(32, 12);
		int mResult= CustomReturnMethod.multiply(4, 5);
		int M2result= CustomReturnMethod.minus(43, 65);
		System.out.println(addResult);
		System.out.println(mResult);
		System.out.println(M2result);
		
		int a=10, b=5 ;
		int MyResult= CustomReturnMethod.minus(a, b);
		System.out.println(MyResult);
		
		int [] nNums = {2, 5};
		int r=CustomReturnMethod.multiply(nNums[0], nNums[1] );
		System.out.println(r);
		
		if (CustomReturnMethod.add2(10, 166)==176) {
			System.out.println("unit test pessed");
		}else {
			System.out.println("failed");
		}
		
		String str="java";
		if (CustomReturnMethod.add2(2, 2)==str.length()) {
			System.out.println("correct");
		}else {
			System.out.println("incorrect");
		}
		
		
		
	}

}
