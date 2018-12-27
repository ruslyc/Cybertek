package day49_Abstract;

public class CheckingAccount extends BankAccount{
	
	@Override
	
	public boolean transfer(double amount, BankAccount sendTo) {
			
			if(balance>=(amount*1.03)) {
				
				System.out.println(amount + " was tranfered from account "+ accountNumber + " to " + sendTo.accountNumber);
				
				balance-=(amount*1.03);
				
				sendTo.balance+=amount;
			}else {
				
				System.out.println("Not suficient balance in "+ accountNumber);
				return false;
			}
			return true;
		}
	
	

}
