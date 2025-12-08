package bank.services;

import bank.account.*;
import bank.user.*;

public interface AccountService {
	
//	Zuständig für Kontoerstellung, Suche und Löschung.

	Account createAccout(User UserName);
	
	Account findAccount(String AccountNumber);
	
	boolean deleteAccount(String AccountNumber);
}
