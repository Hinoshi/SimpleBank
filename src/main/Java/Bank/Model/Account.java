package main.Java.Bank.Model;

import java.math.*;
import java.util.*;

public interface Account {
	
	UUID id ;
	
	String owerName ;
	
	String Iban ;
	
	BigDecimal balance ;

	    UUID getId();
	    
	    String getOwnerName();

	    void setOwnerName(String name);
	    
	    String getIban();     // optional  
	   
	    void setIban(String iban);
	    

	    BigDecimal getBalance();     // unveränderlich zurückgeben
  
	    void setBalance(BigDecimal b);    // nur wenn sinnvoll (sonst über Service ändern)

	    AccountType getType();          // optional
	

}
