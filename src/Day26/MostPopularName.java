package Day26;

import java.util.Arrays;
import java.util.Random;

public class MostPopularName {
	public static void main(String[] args) {
		String[] names = { "James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda", "William",
				"Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah", "Charles",
				"Margaret", "Christopher", "Karen", "Daniel", "Nancy", "Matthew", "Lisa", "Anthony", "Betty", "Donald",
				"Dorothy", "Mark", "Sandra", "Paul", "Ashley", "Steven", "Kimberly", "Andrew", "Donna", "Kenneth",
				"Emily", "George", "Carol", "Joshua", "Michelle", "Kevin", "Amanda", "Brian", "Melissa", "Edward",
				"Deborah", "Ronald", "Stephanie", "Timothy", "Rebecca", "Jason", "Laura", "Jeffrey", "Helen", "Ryan",
				"Sharon", "Jacob", "Cynthia", "Gary", "Kathleen", "Nicholas", "Amy", "Eric", "Shirley", "Stephen",
				"Angela", "Jonathan", "Anna", "Larry", "Ruth", "Justin", "Brenda", "Scott", "Pamela", "Brandon",
				"Nicole", "Frank", "Katherine", "Benjamin", "Samantha", "Gregory", "Christine", "Raymond", "Catherine",
				"Samuel", "Virginia", "Patrick", "Debra", "Alexander", "Rachel", "Jack", "Janet", "Dennis", "Emma",
				"Jerry", "Carolyn", "Tyler", "Maria", "Aaron", "Heather", "Henry", "Diane", "Jose", "Julie", "Douglas",
				"Joyce", "Peter", "Evelyn", "Adam", "Joan", "Nathan", "Victoria", "Zachary", "Kelly", "Walter",
				"Christina", "Kyle", "Lauren", "Harold", "Frances", "Carl", "Martha", "Jeremy", "Judith", "Gerald",
				"Cheryl", "Keith", "Megan", "Roger", "Andrea", "Arthur", "Olivia", "Terry", "Ann", "Lawrence", "Jean",
				"Sean", "Alice", "Christian", "Jacqueline", "Ethan", "Hannah", "Austin", "Doris", "Joe", "Kathryn",
				"Albert", "Gloria", "Jesse", "Teresa", "Willie", "Sara", "Billy", "Janice", "Bryan", "Marie", "Bruce",
				"Julia" };

//		System.out.println(names.length);
//
//		System.out.print(Arrays.toString(names));
//
//		for (int i = 0; i < names.length - 1; i++) {
//			System.out.println(names[i] + ", " + names[i + 1]);
//
//		}
//
//		for (int k = 0; k < names.length - 2; k++) {
//			if (k % 2 != 0) {
//				System.out.print(names[k] + ", ");
//			}
//
//		}
//		for (int m = 0; m < names.length; m += 2) {
//			System.out.print(names[m] + ", ");
//
//		}
//		Random random = new Random();
//		int r = random.nextInt(names.length);
//		System.out.print("random name " + names[r]);
//
//		for (String string : names) {
//			if (string.length() <= 4) {
//				System.out.println(string.toUpperCase() + ", ");
//			}
//
//		}
//		String names3to4 = "";
//		String names5to6 = "";
//		String names7toMore = "";
//
//		for (String string1 : names) {
//			if (string1.length() < 4) {
//				names3to4 += string1 + " ";
//			} else if (string1.length() >= 5 && string1.length() <= 6) {
//				names5to6 += string1 + " ";
//			} else if (string1.length() > 7) {
//				names7toMore += string1 + " ";
//
//			}
//
//		}
//		System.out.println(names3to4);
//		System.out.println(names5to6);
//		System.out.println(names7toMore);
//		
//		
		
	
		
		for (int h = 0; h < names.length; h=h+2) {
			String t=names[h];
			names[h]=names[h+1];
			names[h+1]=t;
		}
		
		System.out.println(Arrays.toString(names));
//		for (int i = 0; i < names.length - 1; i++) {
//			System.out.print(names[i]+ " ");
//
//		}
//		

	}

}
