package bank.transaction;

import bank.account.Account;

public interface Transaction {
	
//	Beschreibt jede Banktransaktion (Einzahlung, Überweisung, Auszahlung).
//	Jede Aktion, die Geld bewegt, ist eine Transaction.

	String getId();
	
	Account getSourceAccount();
	
	Account getdestinationAccount();
	
	
	double getAmount ();
	
	String getTimestamp();
	
	void execute();
}
