package Day33;

public class PayCalculator {

	public static void main(String[] args) {

		int pay = getHoutlyPay(40, 50);
		System.out.println(pay);

	}

	public static int getHoutlyPay(int hours, int rate) {

		if (hours <= 0) {
			System.out.println("invalid hours");
			return 0;
		}

		if (rate <= 0) {
			System.out.println("invalid");
			return 0;
		}
		int total=hours*rate;
		return total;


	}
}
