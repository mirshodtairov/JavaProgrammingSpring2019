package Day36WrapperClass;

public class WrapperClasses {

	public static void main(String[] args) {
		int n = 10;
		Integer n2 = new Integer(n);
		System.out.println(n);
		 double d1=44.5;
		 Double d2= new Double(d1);
		 Double d3=new Double("5.2");
		 System.out.println(d3);
		 int sum=(int) (d3+10);
		 System.out.println(sum);
		 
		 char ch1 = 'a';
		 Character ch2= new Character ('b');
		 System.out.println(ch2);
		 System.out.println(ch1);
		 
		 
		 byte b1 =100;
		 Byte b2 = new Byte ((byte)10);
		 Byte b3 = new Byte(b2);
		 System.out.println(b1);
		 System.out.println(b2);
		 System.out.println(b3);
		 
		 Integer num1= Integer.valueOf(1234);
		 Integer num2= Integer.valueOf("567");
		 Boolean bool1= Boolean.valueOf(true);
		 Boolean bool2= Boolean.valueOf("false");
		 System.out.println(num1);
		 System.out.println(num2);
		 System.out.println(bool1);
		 System.out.println(bool2);
		 System.out.println();
		 
		 Integer i = 1234; // new Integer
		 System.out.println(i);
		 int c = 1234;
		 if(i==c) {
			 System.out.println(true);
		 }else {
			 System.out.println(false);
		 }
		 
		 
		 
		 
		 
		 

	}

}
