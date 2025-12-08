package Model;

import java.math.BigDecimal;
import java.util.*;

public interface Account {

	    UUID getId();
	    String getOwnerName();
	    void setOwnerName(String name);

	    String getIban();               // optional
	    void setIban(String iban);

	    BigDecimal getBalance();        // unveränderlich zurückgeben
	    void setBalance(BigDecimal b);  // nur wenn sinnvoll (sonst über Service ändern)

	    AccountType getType();          // optional
	

}
