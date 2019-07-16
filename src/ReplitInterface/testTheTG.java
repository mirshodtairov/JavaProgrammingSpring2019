package ReplitInterface;

public class testTheTG implements TabGen {

	@Override

	/**
	 * Override the abstract method from TableGenerator interface.
	 *
	 * @param start           - start prime numbers sequence from this int
	 * @param numberOfEntries - how many prime numbers need to be in returning int[]
	 *                        array
	 * @return int[] array with prime numbers
	 *
	 *         Note: Call isPrime method while looking for prime numbers to fill up
	 *         sequence array.
	 *
	 *         Examples: generateTable(1, 3); => [2, 3, 5] first 3 prime numbers
	 *         starting from 1 is 2,3,5 1 itself is not prime so it is not in the
	 *         array.
	 *
	 *         generateTable(5, 3); => [5, 7, 11] first 3 prime numbers starting
	 *         from 5 is 5,7,11 * 5 itself is prime so it is in the array.
	 */

	public int[] generateTable(int value, int numberOfEntries) {
		int[] aaa = new int[numberOfEntries];
		for (int i = value; i < aaa.length; i++) {
			if (value % 2 == 0) {

				aaa[i] = value;
				value++;
			}

		}
		return aaa;
	}

	@Override
	public boolean checkTable(int value, int[] tableToTest) {
		for (int i = value; i < tableToTest.length; i++) {
			if (value % 2 == 0) {

				return true;
			}

		}
		return false;
	}

	@Override
	public boolean isPrime(int number) {
		if (number<=1) 
			return false;
		
		

		for (int i = 2; i < number ; i++) 
			if (number%i==0) {
				return false;
				
			
			
		}
		return false;
	}

}
