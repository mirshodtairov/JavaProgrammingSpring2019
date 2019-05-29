package Day50_inheritance3;

public class SlacckChannel {

	public static void main(String[] arr) {
		SlackUser su= new SlackUser("Nadir");
		AdminUser au = new AdminUser("Florian");
		
		
		su.sendAMessage("This Thursday we will summarize Jira");
		au.sendAMessage("Thank you");
	}

}
