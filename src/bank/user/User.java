package bank.user;

public interface User {
	
//	Repräsentiert eine Person im Bankensystem (Kunde oder Admin).
	
	
	String Id ;
	
	String Name ; 
	
	String  Email ;


	String getId();
	
	String getName();
	
	void setName(String name);
	
	String getEmail();
	
	String SetEmail(String Email);
}
