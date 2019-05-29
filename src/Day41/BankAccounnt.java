package Day41;

//import jdk.javadoc.internal.doclets.toolkit.resources.doclets;

public class BankAccounnt {

	String accountHolder;
	double balance;
	int accountNum;
	public void deposit(double amount) {
		System.out.println("depositing $"+amount+ " to "+accountNum);
		balance+=amount;
		
		
	}public void withdraw(double amount) {
		System.out.println("withdrawing $"+ amount+" from"+ accountNum);
		balance -=amount;
		if (balance<0) {
			balance-=35;
			
		}
		
	}
	public void showBalance() {
		System.out.println("account holder"+ accountHolder);
		System.out.println("account number "+accountNum);
		System.out.println("balance $"+balance);
		
	}
	public void charge(int price, String item) {
		if (price>balance) {
			System.out.println("Can not complite transaction, sorry!!! Your balace is"+ balance);
			balance-=price;
		}else {
			System.out.println("Transaction complited, new balance is "+balance);
			balance-=price;
		}
		
	}
	
	
}
