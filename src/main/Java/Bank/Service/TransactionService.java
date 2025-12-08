package main.Java.Bank.Service;

import java.math.*;
import java.time.*;
import java.util.*;

import javax.security.auth.login.AccountNotFoundException;

import main.Java.Bank.Exception.*;
import main.Java.Bank.Model.*;

public interface TransactionService {


	    TransactionResult transfer(UUID fromAccountId, UUID toAccountId, BigDecimal amount, String description)
	        throws InsufficientFundsException, AccountNotFoundException, InvalidTransactionException;

	    TransactionResult deposit(UUID toAccountId, BigDecimal amount, String description)
	        throws AccountNotFoundException, InvalidTransactionException;

	    TransactionResult withdraw(UUID fromAccountId, BigDecimal amount, String description)
	        throws InsufficientFundsException, AccountNotFoundException, InvalidTransactionException;

	    List<Transaction> getTransactionsForAccount(UUID accountId, Instant from, Instant to)
	        throws AccountNotFoundException;
	}

}
