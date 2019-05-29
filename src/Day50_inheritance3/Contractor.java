package Day50_inheritance3;

public class Contractor extends Employee {
	@Override
	public void calculatePay(int hours, double rate) {
		double total = (hours * rate) * 1.05 + 200;
		System.out.println(total);

	}
}
