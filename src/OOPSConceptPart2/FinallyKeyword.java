package OOPSConceptPart2;

public class FinallyKeyword {
   //Finally block will be executed after try/catch block is executed.
   
	public static void main(String[] args) {
		//test1();
		//test2();
	    division();
	}
	
	public static void test1(){
		try{
			System.out.println("Inside test1 method");
		    throw new RuntimeException("test");
		}catch(Exception e){
			System.out.println("Inside Catch blcok");
		}
		finally
		{
			System.out.println("INside Finally block");
		}
		
	}
	
	public static void test2(){
		try{
			System.out.println("Inside test2");
		}
		finally{
			System.out.println("Finally Code in test2 method");
		}
	}
	
	public static void division(){
		int i = 10;
		try{
			System.out.println("Inside try block");
			int k = i/0; // it would give  arithematic exception
		}catch(NullPointerException e ) {
			System.out.println("Inside catch block");
			System.out.println("divide by zero error");
		}
		finally{
			System.out.println("Execute code after this method");
		}
	}
}
