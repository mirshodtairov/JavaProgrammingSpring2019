package Day7;

public class preAndPost {

	public static void main(String[] args) {
	int messages = 10;
	messages++;
	++messages;
	System.out.println(messages);
	
	int readMessages = --messages;
	System.out.println(readMessages);
	System.out.println(messages);
	
	int unreadMessages = readMessages--;
	System.out.println(unreadMessages);
	System.out.println(readMessages);
	
	
	int total = unreadMessages++ - readMessages--;
	System.out.println(unreadMessages);
	System.out.println(readMessages);
	System.out.println(total);
	
	int count = 20;
	int count2 = 10;
	int totalCount = ++count + --count2;
	System.out.println(count);
	System.out.println(count2);
	System.out.println(totalCount);
	
	
	int myCount = count++ + ++count;
	System.out.println(count);
	System.out.println(myCount);
	
	}

}
