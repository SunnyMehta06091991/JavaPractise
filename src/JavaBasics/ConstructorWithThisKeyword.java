package JavaBasics;

public class ConstructorWithThisKeyword {
    String name;
    int age;
	//Whenever we want to initialize the global value of class with current value of constructor this keyword is used.
	public ConstructorWithThisKeyword(String name, int age){//name and age are local variables for constructor
		//this.globalvairbale = localvariable
		this.name = name;
		this.age = age;
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Sunny", 27);
	    System.out.println(obj.name);
	    System.out.println(obj.age);
	
	}
}
