package main.Java.Bank.Interface;

import java.util.*;

public interface UserRepository {

		
	    Optional<User> findByUsername(String username);
	    void save(User user);
	

}
