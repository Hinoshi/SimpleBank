package Persistence;

import java.nio.file.Path;
import java.util.*;

import Class.Transaction;
import Model.Account;

public interface PersistenceService {

	
	    void saveAccounts(Collection<Account> accounts) throws PersistenceException;
	    List<Account> loadAccounts() throws PersistenceException;

	    void saveTransactions(Collection<Transaction> transactions) throws PersistenceException;
	    List<Transaction> loadTransactions() throws PersistenceException;

	    void backup(Path target) throws PersistenceException;
	}

}
