package OOPSConcept;

public class ClassAndObject {

	//Class is template which is blueprint and it contains functions and variables.
	//Lets create 2 global variables
	//Object --> 
	//		ClassAndObject c = new ClassAndObject();
    //  new ClassAndObject() ---> its an object 
	// c is reference variable.
	int mod;
	int wheel;
	public static void main(String[] args) {
		ClassAndObject c = new ClassAndObject();
		ClassAndObject d = new ClassAndObject();
		ClassAndObject e = new ClassAndObject();

		c.mod = 20;
		c.wheel = 23;
		System.out.println(c.mod);
		System.out.println(c.wheel);

		d.mod = 65;
		d.wheel = 15;
		System.out.println(d.mod);
		System.out.println(d.wheel);

		e.mod = 16;
		e.wheel = 5;
		System.out.println(e.mod);
		System.out.println(e.wheel);
	    c = d;
	    d = e;
	    e = c;
		System.out.println("After assigning the reference");
		System.out.println(c.mod);
		System.out.println(c.wheel);
		System.out.println(d.mod);
		System.out.println(d.wheel);
		System.out.println(e.mod);
		System.out.println(e.wheel);

	}
}
