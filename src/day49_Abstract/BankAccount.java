package day49_Abstract;

public class BankAccount {
	
	String type, name;
	
	int accountNumber;
	
	double balance;
	
	public void deposit(double amount) {
		
		System.out.println(amount + " was deposited to " + accountNumber );
		
		balance+=amount;
		
	}
	
	public void withdraw(double amount) {
		
		if(amount<=balance) {
			
			System.out.println(amount + " was withdrawd from " + accountNumber);
			
			balance-=amount;
		}else {
			
			System.out.println("Not suficient balance in "+ accountNumber);
		}
		
	}
	
	public boolean transfer(double amount, BankAccount sendTo) {
		
		if(balance>=(amount*1.05)) {
			
			System.out.println(amount + " was tranfered from account "+ accountNumber + " to " + sendTo.accountNumber);
			
			balance-=(amount*1.05);
			
			sendTo.balance+=amount;
		}else {
			
			System.out.println("Not suficient balance in "+ accountNumber);
			return false;
		}
		return true;
	}

}
