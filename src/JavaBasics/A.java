package JavaBasics;

public class A {

	public A(){
		System.out.println("Parent Class Constructor");
	}
	
	public A(int i){
		System.out.println("Value of i is " + i);
	}
	
	public A(int k, int l){
		System.out.println("Value of k and l are" + (k+l));
	}
}
