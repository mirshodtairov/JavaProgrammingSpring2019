package VasylApril11Fundamentals;

public class WrapperClassPractice {

	public static void main(String[] args) {
		int a = 10;
		Integer nums2 = new Integer(10);
		System.out.println(a == nums2);

		String age = "25";
		int agenum = Integer.parseInt(age);// this the way transforming for string to Int
		System.out.println(agenum);// now we can do math operations
		System.out.println(agenum + 25);

		String text = "wind 31 mph";
		String splited[] = text.split(" ");
		for (int i = 0; i < splited.length; i++) {
			if (Character.isDigit(i)) {
				int number = Integer.parseInt(splited[i]);
				if (number > 30) {

				}
			}

//				
//				
//					System.out.println("you are in denger");
//				} else {
//					System.out.println("you are ok");
//				}

		}

	}
}
