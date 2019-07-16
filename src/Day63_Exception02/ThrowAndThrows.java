package Day63_Exception02;

public class ThrowAndThrows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		//throw new RuntimeException("This is throw using throw keyword");
        String username = "user1";
        if(username.isEmpty()) {
        	throw new RuntimeException("User name cannot be empty");
        }else {
        	System.out.println("Valid username");
        }
        
        try {
        sleep(2);
        }catch (Exception e) {
        	
        }
        sleep(3);
        sleep2(2);
	}
	public static void sleep(int seconds) throws InterruptedException {
		Thread.sleep(seconds*1000);
		
	}
	public static void sleep2(int seconds) throws InterruptedException {
		sleep(1);
	}

}
