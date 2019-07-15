package OOPSConceptPart2;

public interface USBank {
   // IN interface no main method is present.
   // Child class can have many parent interface whereas it can only have one parent class. 
   // Only methods are defined in interface, no method body is required.
	//ONly method declaration.
	// In interface , we can define variables but values of variables will not change.
	//Variables will be static in nature
	//No static method allowed// INterfaces are part of objects hence cannot write static methods.
	//INterfaces are abstract in nature i.e we cannot create object of interfaces.
	//Variables values will be constant/final in nature

	int min_bal = 100;
	public void credit();
	
	public void debit();
	
	public void transfermoney();
	
}
