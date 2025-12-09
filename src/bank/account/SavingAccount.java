package bank.account;

import bank.user.User;

public class SavingAccount extends BasicAccount{
	
	
	private double interestRate ;

	public SavingAccount(String accountnummer, double balance, User owner, double Interestrate  ) {
		

		super(accountnummer, balance, owner);
		
		this.interestRate = Interestrate ;
		
		
		if (interestRate <0) {
			
			throw new IllegalArgumentException(" Die InterestRate  muss nicht negativ sein ");
		}
		
		
	}
	
		public  double getInterestRate() {
		 
		 return interestRate ;
	 }
	 


		@Override
		public boolean withdraw(double amount) {
			
			if (amount<=0) {

				 
				 throw new IllegalArgumentException("Der Abhebungsbetrag muss größer als 0 sein.");
					
					
				}
			
			if(amount > balance) {

					return false ;
					
				}
					
					balance -=amount ;
					
					
			return true ;
			
				
		}
		
		public void  applyInterest () {
			
			balance += (balance * interestRate / 100);
		}
		
		
		@Override
		public String toString() {
			
		    return "SavingAccount " + getAccountNummer() +
		           " (Balance: " + balance + " EUR, Zins: " + interestRate + "%)";
		}


}
