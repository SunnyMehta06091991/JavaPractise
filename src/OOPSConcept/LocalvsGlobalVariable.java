package OOPSConcept;

public class LocalvsGlobalVariable {
    //Global Variables or class variables--> Scope is within program
	//To access them we will have to create object of class and then use it.
	//Non Static Global Variables.
	//What will happen in JAVA memory..
	//
	
	String name = "Sunny";
	int age = 25;
	public static void main(String[] args) {
	LocalvsGlobalVariable loc = new LocalvsGlobalVariable();
	int i = 10; //local variable of main method
	System.out.println(i);
	System.out.println(loc.age);
	System.out.println(loc.name);
	loc.sum();
}
	
	public void sum(){
		//age scope is within sum method -->Local variables
		int i =15;//local variable for sum method
		int j = 20;
		int age = 25;
		System.out.println(i);
		
	}
}
