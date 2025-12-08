package bank.account;

import bank.user.*;

public class BasicAccount implements Account {

	private String accountNummer ;
	
	private double  balance ;
	
	private User owner ;
	
		
	public BasicAccount( String accountnummer , double balance , User owner ) {
		
		
		
		
		if (accountNummer.isEmpty() || accountnummer == null ) {
			
			throw new IllegalArgumentException( " Die AccountNummer darf  auf null unterschiedlich sein ") ;
		}
		
		if (owner == null) {
			
			throw new IllegalArgumentException( " Die owner muss auf null unterschiedlich sein ") ;
		}
		
		if (balance <0) {
			
			throw new IllegalArgumentException( " Die balance muss auf 0 unterschiedlich sein ") ;
		}
		
		this.accountNummer = accountnummer;
		
		this.balance = balance ;
		
		this.owner = owner ;
				
		
	}
	
	
	@Override
	public String getAccountNummer() {
		
		return accountNummer;
	}

	@Override
	
	public double getBalance() {
		
		
		return balance;
	}

	@Override
	public void deposit(double amount) {
		
		if (amount <=0) {
			
			throw new IllegalArgumentException("Der Einzahlungsbetrag muss größer als 0 sein.");
			
		}else {
			
			balance += amount ;
		}
		
	}

	@Override
	public boolean withdraw(double amount) {
		
		 if (amount<=0) {

			 
			 throw new IllegalArgumentException("Der Abhebungsbetrag muss größer als 0 sein.");
				
				
			}else if(amount > balance) {

				return false ;
				
			}else {
				
				balance -=amount ;
				
				
			}
			return true ;
	}

	@Override
	public User getOwner() {
		
		return owner;
	}
	
	@Override
	
	public String  toString() {
		
		
		return "Account " + accountNummer + " (Balance: " + balance + " EUR)";

	}

}
