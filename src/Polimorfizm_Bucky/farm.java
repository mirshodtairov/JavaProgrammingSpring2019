package Polimorfizm_Bucky;

public class farm {
	public static void main(String[] args) {
	
//		animals animal1 = new donkey();
//		animal1.run();
//		
//		animals animal2 =new animals();
//		animal2.run();
//		
		animals[] ani= new animals[2];
		ani[0]= new donkey();
		ani[1]= new horse();
		for (int i = 0; i < ani.length; i++) {
			ani[i].run();
			
		}
		
		
		
		
	}

}
