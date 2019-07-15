package OOPSConcept;

public class FunctionsinJava {

	public static void main(String[] args) {
        // Functions/Methods are both same thing.. They are like a factory in city(E.g Nike, Rebock)it would give some output.
		//3 types of methods.
		//1.) No input no output.
		//2.) No input and will get output.
		//3.) Input and output.
		//Starting point of execution is main method; if nothing is present in it , execution will be completed with no methods executed.
		//To call non-static methods first we need to create and object of class , so that all methods gets allocated to it.
		
		FunctionsinJava fun = new FunctionsinJava();
		fun.test();
		int d = fun.testing();
		System.out.println("Value of testing method is " + d);
		String x  = fun.returnString();
		System.out.println("Value of x is " + x);
		int s = fun.division(30,10);
		System.out.println(s);
		
	}

	public void test(){
		System.out.println("This is test");
	}
   // return type is int
   public int  testing(){
	   System.out.println("Inside testing method");
	   int a = 20;
	   int b =30;
	   int c = a + b;
	   return c;
   }
   //return type is string
   public String returnString(){
	   System.out.println("Inside returnString method");
       String s = "Sunny";
       return s;
    		   
   }
   
   //Method which accepts input and return something.
   public int division(int a , int b){
	   System.out.println("Inside Division method");
	   int x = a;
	   int y = b;
	   int z = x/y;
	   return z;
   }
}
