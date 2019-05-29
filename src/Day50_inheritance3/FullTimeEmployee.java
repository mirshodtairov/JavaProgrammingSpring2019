package Day50_inheritance3;

public class FullTimeEmployee extends Employee {

	public void calculatePay(int hours, double rate) {
		double total=(hours * rate)*1.05;
		System.out.println(total);
		

	}
}
