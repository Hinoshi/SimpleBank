package Interface;

import java.util.*;

import Class.Transaction;

public interface PersistenceService {

	
	    void saveAccounts(Collection<Account> accounts) throws PersistenceException;
	    List<Account> loadAccounts() throws PersistenceException;

	    void saveTransactions(Collection<Transaction> transactions) throws PersistenceException;
	    List<Transaction> loadTransactions() throws PersistenceException;

	    void backup(Path target) throws PersistenceException;
	}

}
