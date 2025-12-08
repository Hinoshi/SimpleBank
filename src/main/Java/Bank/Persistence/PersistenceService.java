package main.Java.Bank.Persistence;

import main.Java.Bank.Exception.*;
import main.Java.Bank.Model.*;
import java.nio.file.Path;
import java.util.*;

public interface PersistenceService {

	
	    void saveAccounts(Collection<Account> accounts) throws PersistenceException;
	    List<Account> loadAccounts() throws PersistenceException;

	    void saveTransactions(Collection<Transaction> transactions) throws PersistenceException;
	    List<Transaction> loadTransactions() throws PersistenceException;

	    void backup(Path target) throws PersistenceException;
	}

}
