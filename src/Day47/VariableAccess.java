package Day47;

public class VariableAccess {
	
	
	int myInstanceVar=40;
	static int MyStaticVariable =55;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(MyStaticVariable);
		
		VariableAccess VA= new VariableAccess();
		System.out.println(VA.myInstanceVar);
		System.out.println(VA.MyStaticVariable);
		System.out.println(VariableAccess.MyStaticVariable);
		
		

	}

}
