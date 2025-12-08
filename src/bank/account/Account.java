package bank.account;

import bank.user.*;

public interface Account {
	
//	Grundstruktur jedes Kontotyps.
//	Alle Kontoarten (Spar, Giro, Kredit) müssen diese Methoden implementieren.

	String getAccountNummer();
	
	double getBalance();
	
	void deposit(double amount);
	
	boolean withdraw(double amount);
	
	User getOwner();
}
