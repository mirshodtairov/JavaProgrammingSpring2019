package RplIt;

public class bookingInCertainDays {

	public static void main(String[] args) {
		System.out.println(simpleRoomBook(true, 2, 1, 2018));

	}

	public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {
		if (isAvailable == true && month >= 1 && month <= 12 && day >= 8 && day <= 31 && year == 2018) {
			return true;

		} else if (isAvailable == true && month >= 1 && month <= 12 && day >= 1 && day <= 8 && year == 2018) {
			return false;

		} else if (isAvailable == true && month >= 1 && month <= 12 && day >= 1 && day <= 31 && year == 2018) {
			return true;

		}
		return false;
	}
}