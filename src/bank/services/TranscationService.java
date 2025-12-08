package bank.services;

import bank.account.*;
import bank.transaction.*;

public interface TranscationService {
	
//	Regelt die Geschäftslogik zu Transaktionen.

	Transaction transfer ( Account from , Account to , double Amount);
	
	Transaction deposit ( Account to , double Amount );
	
	Transaction withdraw ( Account from , double Amount);
}
