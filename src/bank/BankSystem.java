package bank;

public interface BankSystem {

//	Das zentrale Kontroll-Interface.
//	Definiert, welche Basisfunktionen ein Bank-System bereitstellen muss (Starten, Herunterfahren, Name etc.).
	
	String Bank_Name ;
	
	void Start();
	
	void Shutdown();
	
	String getBankName();
	
	
}
