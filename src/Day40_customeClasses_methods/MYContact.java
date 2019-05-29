package Day40_customeClasses_methods;

public class MYContact {

	public static void main(String[] args) {
		Contact contact1=new Contact();
		contact1.name="Pier Emerik Aubameyang";
		contact1.phoneNumber= "214-14-14";
		contact1.email= "Aubameyang@arsenalfc.com";
		
		
		contact1.call();
		contact1.sendMessage();
		contact1.sendEmail();
		
		Contact AlexLacazet = new Contact();
		AlexLacazet.name= "Alexsander Lacazet";
		AlexLacazet.phoneNumber = "9";
		AlexLacazet.email= "alex@arsenal.com";
		
		System.out.println("Name: "+ AlexLacazet.name);
		System.out.println("Shirt "+ AlexLacazet.phoneNumber);
		System.out.println("Email "+AlexLacazet.email);

	}

}
