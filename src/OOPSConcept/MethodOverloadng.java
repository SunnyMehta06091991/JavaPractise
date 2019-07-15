package OOPSConcept;

public class MethodOverloadng {
    //Same method name with same parameters are not allowed.
	//Signarture should be different.
	//Method overloading --->Method name is same with different arguements/different data types or input parameters within same class is called method overloading..
	//cannot create method inside a method
	//duplicate methods --same methods name with same arguements not allowed
	
	
	//Can we overload main method...
	//Yes we can overload main method,
	public static void main(String[] args) {
		MethodOverloadng obj = new MethodOverloadng();
		obj.sum();
		obj.sum(5);
		obj.sum(3, 5);
		MethodOverloadng.main(5);
		MethodOverloadng.main(5, 6);
	}
	
	public static void main(int b){
		System.out.println(b);
	}
	
	public static void main (int c ,int d){
		System.out.println(c+d);
	}
	
	public void sum(){
		System.out.println("SUM method ---zero parameter");
	}
	
	public void sum(int i){
		System.out.println("Sum method ---one parameter");
	    System.out.println(i);
	}
    
	public void sum(int k,int l){
		System.out.println("Sum Method --- two parameter");
	    System.out.println(k+l);
	}
	
}
