package JavaBasics;

public class Constructor {
   //Constructor means class entity which is used to define some class features while creating object.
   //It does not return any values.
   //Constructor name should be as class name.
   //no static or non static keyword in constructor.
	//Constructor can also be overloaded.
	//Constructor will be called immediately after object is created for class.
	//Type of Constructor.
	//1.)Default Constructor --> if object has no arguments, hidden constructor is always created if no default constructor is created.
	public Constructor(){
		System.out.println("Default Constructor");
	}
	
	public Constructor(int a){
		System.out.println("ONe Parameter Constructor");
	    System.out.println("Value of a is " + a);
	}
	
	public Constructor(int a, int b){
		System.out.println("Two Parameter COnstructor");
		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + b);
	}
	public static void main(String[] args) {
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor(2);
		Constructor c3 = new Constructor(2,4);
	}
}
