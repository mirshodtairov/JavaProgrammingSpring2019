package Day36WrapperClass;

public class Boxing {

	public static void main(String[] args) {
		 Integer num = 1234;
		 int n = 5;
		 Integer num2= n;
		 System.out.println(num2);
		 
		 
		 Boolean b= true; 
         Boolean c= new Boolean(b);
         
         Double d1 = new Double (34.2);
         double d2=d1;
         System.out.println("d1 "+d1);
         System.out.println("d2 "+d2);
         
         long l1 = new Long ( 6000000 );
         Integer num5 = Integer.valueOf(345);
         //Doubble d=num5; can not be converted 

	}

}
