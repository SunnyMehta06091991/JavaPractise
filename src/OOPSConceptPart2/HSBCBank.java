package OOPSConceptPart2;

public class HSBCBank implements USBank,BrazilBank{
//Is-A Relationship ---> Interface and class.
//Has-A relationship ---> Class to class realtionship
//Multiple inheritance ---> Multiple parents are there for same child class.	
//If particular class is implementing interface,we have to define all methods of interface in child class.
//US Bank is not bothered about what exactly the code would be in below methods but it wants this 3 facilites to be implemented for its customers.	
	public void mutualfund(){
		System.out.println("HSBC--BrazilBank Mutual Fund");
	}
	public void credit() {
    System.out.println("HSBC--Credit method");
		
	}

	public void debit() {
		System.out.println("HSBC--Debit method");
	}

	public void transfermoney() {
		System.out.println("HSBC--Transfer Money");
	}

	public void educationLoan(){
		System.out.println("HSBC--EducationLoanMethod");
		
	}
	
	public void carLoan(){
		System.out.println("HSBC--CarLoan method");
	}
}
