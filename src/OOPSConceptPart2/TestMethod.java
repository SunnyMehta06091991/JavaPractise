package OOPSConceptPart2;

public class TestMethod {
//Can create object of BMW class, HEnce I can create object of BMW class anywhere.

	public static void main(String[] args) {
		//Compile/Static polymorphism --> At compile time java compiler will decide which method to call.
		//polymorphism ---> same method with many parameters.
		BMW b = new BMW();
		//Here BMW is child class and Car is parent class and if some method is common in both classes , and if same method is called child class method will be executed since refrence variable is for child class
		//IN this case Java complier will say to child class you are already having your own start method, why are you inheriting for parent, use your own child method, so child class start method will be called.
		//MEthod Overriding --> When same method is present in parent class and child class with same name and same number of arguements is called method overriding.
		//Method overloading--> When same method with different signatures/parameters is present in same class , its called method overriding.
		b.start(); 
		b.stop();
		b.refuel();
		b.engine();
		System.out.println("*****************************");
		//IN this case as parent class cannot inherits from chilid class propeties , hence child class theftSafety method cannot be called.
		Car c = new Car();
		c.start();
		c.start();
		c.refuel();
		c.engine();
		
		System.out.println("**************************");
		//Child class obj can be referred by parent class object reference is called dynamic polymorphism or runtime polymorphism.
		//Only overriden methods and parent class methods will be called using dynamic polymorphism.
		//Top Casting ---> 
		Car c1 = new BMW();
		c1.start();// IN this case preference will always be given to child class methods.
		c1.stop();
		c1.refuel();
		
		//Down Casting is not allowed...Cannot convert from car to BMW.
		BMW b1 =(BMW) new Car(); // We are casting it into smaller class
		//While execution it will give you exception as 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//c1.theftsafety();---> This method cannot be called.
	}
	
	
}
