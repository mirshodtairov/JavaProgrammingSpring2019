package Day18loops;

public class Counter {

	public static void main(String[] args) throws InterruptedException {
		int num = 1;
		while (num<=10) {
			
			System.out.print(num+", ");
			num++;
			Thread.sleep(700);
		}
		
		System.out.println();
		
		int num2=11;
		while (num2>=1) {
			System.out.print(num2+", ");
			num2--;
			Thread.sleep(456);
		}
				
	}

}
