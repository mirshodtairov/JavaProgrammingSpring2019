package Exceptions01;

public class RunTimeError {
        static int i =0;
	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		go();
		
		

	}
	
	public static void go() throws InterruptedException {
		System.out.println(i+" going");
		//Thread.sleep(2000);
		i++;
		go(); ///
		
		
	}

}
