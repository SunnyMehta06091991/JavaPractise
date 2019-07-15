package OOPSConcept;

public class StaticAndNonStaticConcept {
    //Global Variables Scope --1>Throughout all functions with some conditions
	
	
	String name = "Sunny"; //non static global variable
	static int age = 25; // static global variable
	
	public static void main(String[] args) {
		//For static methods and variables seperate memory allocation will be given in JVM.
		//How to call static method and variables.
		//.1) Call directly.
		sumMethod();
		//2.) Call by class name
		StaticAndNonStaticConcept.sumMethod();
		
		//How to call variables:
		// Call direclty static variables
		System.out.println(age);
		// call by class name
		System.out.println(StaticAndNonStaticConcept.age);
		
		//For non-static method
		StaticAndNonStaticConcept s = new StaticAndNonStaticConcept();
		s.sendMail();
		
		//CAn i access static methods and variables with object,--> Yes
		s.sumMethod();// it will give a warning (method sumMethod should be access in static way)
		
	}
	
	//non-static method
	public void sendMail(){
		System.out.println("send mail method");
	}
	
	//static method
	public static void sumMethod(){
		System.out.println("sum method");
	}
}
