package OOPReplit;

public class ParkingMeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int timeLeft = 0;
	public int maxTime;

	public ParkingMeter(int maxTime) {
		this.maxTime = maxTime;
	}

	public boolean add(int parametr) {
		if (parametr == 25) {
			timeLeft += 30;
		} else {
			this.timeLeft = timeLeft;
		}
		if (timeLeft > 0) {
			return true;

		} else {
			return false;
		}

	}

	public void tick() {
		if (timeLeft > 0) {
			timeLeft++;
		}

	}

	public boolean isExpired() {
		if (timeLeft == 0) {
			return true;

		} else {
			return false;
		}
	}

}
