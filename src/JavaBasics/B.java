package JavaBasics;

public class B extends A{
//Super keyword is used to call parent class constructor.
	//super should be first reference
	public B(){
		//super();
		super();
		System.out.println("Child Class Constructor");
	}
	
	public B(int i){
		super(2);
		System.out.println("Child Class Constructor --> one Paramter");
	}
	
	public B(int j, int k){
		super(2,5);
		System.out.println("Child Class Constructor --> Two parameter");
	}
	
	public static void main(String[] args) {
		B b = new B();
		B b1 = new B(2);
		B b2 = new B(2,5);
		
	}
}
