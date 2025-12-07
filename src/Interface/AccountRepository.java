package Interface;

import java.util.*;

public interface AccountRepository {

	    Optional<Account> findById(UUID id);
	    Optional<Account> findByIban(String iban);          // optional

	    List<Account> findAll();                            // vorsichtig bei großen Datenmengen

	    void save(Account account);                         // create or update
	    void delete(UUID id);

	    boolean existsById(UUID id);
	

}
