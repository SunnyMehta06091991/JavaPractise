package OOPSConceptPart2;

public class TestBank {

	public static void main(String[] args) {
       //Cannot instaiate object of USBank it would give error as we cannot create object for Interface. 
		//USBank b = new USBank();
		
	    HSBCBank h = new HSBCBank();
	    h.credit();
	    h.carLoan();
	    h.debit();
	    h.educationLoan();
	    h.transfermoney();
	    
	    //Dynamic Polymorphism -->Child class object and parent interface reference variable.
	    System.out.println("****************************************");
	    
	    USBank b = new HSBCBank();
	    b.credit();
	    b.debit();
	    b.transfermoney();
	   
	
	
	}

}
