package day49_Abstract;

public class BusinessPartners {
	
	public static void main(String[] args) {
		
		BankAccount ba1 = new BankAccount();
		
		ba1.name = "Google";
		
		ba1.accountNumber = 1234567;
		
		ba1.balance = 2000000;
		
		ba1.type = "Business Account";
		
		BankAccount ba2 = new BankAccount();
		
		ba2.name = "James Bond";
		
		ba2.accountNumber = 7654321;
		
		ba2.balance = 400;
		
		ba1.type = "Personal Account";
		
		ba1.deposit(150000);
		
		System.out.println(ba1.balance);
		
		ba1.withdraw(3000000);
		
		ba1.transfer(500000, ba2);
		
	}

}
