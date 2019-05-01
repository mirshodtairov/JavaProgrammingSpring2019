package ArrayAssignments;

public class countMatches {

	public static void main(String[] args) {
		double[] prices = { 33.4, 342.3, 43.21, 54.3, 65.3, 6.0, 545.3, 12.43 };
		int count = 0;
		for (double d : prices) {
			if (d > 20.0) {
				count++;
			}
			if (count == 0)
				System.out.println("non of the prices are less then 20");
		}
		System.out.println(count);

	}

}
