package Day41;

public class CapitalOne {

	public static void main(String[] args) {
		BankAccounnt account = new BankAccounnt();
		//account.accountHolder= "Lucas Toreira";
		
		//account.accountNum= 12335354;
		
		account.deposit(250);
		account.withdraw(100);
		
		account.charge(30, "swatch watch watch ");
		account.showBalance();
		
		
		

	}

}
