package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
     //Disadvantage of array
		//1.) Size of Array is fixed.(its static if you need to add new values after defination it will give error as index out of bound exception)
		//2.) Similar data types values are stored. -- To overcome this problem we use object array.
        //3.) To overcome size issues --> We use collections... (dynamic arrays.)
		int  i = 20;
     //int  i = 10 ; // error as duplicate values are not allowed..
     //multiple values cannot be stored.
     
     //Arrays are basically used to store similar data type values in array variable.
     //lowest index = 0
     //highest index = array.size()-1
     //if index does not exist it gives error as java.lang.arrayindexoutofboundexception
    
     //1. int array
     int j[] = new int[4];
     j[0] = 5;
     j[1] = 6;
     j[2] = 7;
     j[3] = 8;

     System.out.println(j[0]);
     //System.out.println(j[4]);
	System.out.println(j.length);
	System.out.println("***********************************************");
	//print all values of array. use for loop concepts.
	for (int ind = 0 ; ind <j.length ; ind++){
		System.out.println(j[ind]);
	}
	System.out.println("***********************************************");
    //double array
	double d[] = new double[4];
	d[0] = 12.123;
	d[1] = 65.232;
	d[2] = 44.32;
	d[3] = 32.12;
	
	for (int k = 0 ; k < d.length ; k++){
         System.out.println(d[k]);		
	}
	
	char c[] = new char[2];
	c[0] = 'a';
	c[1] = '$';
	
	System.out.println(c[1]);
	
	System.out.println("***********************************************");

	boolean b[] = new boolean[2];
	b[0] = true;
	b[1] = false;
	
	System.out.println(b[1]);
	
	//String is a class and its not and data type.
	String s[] = new String[3];
	s[0] = "Hello";
	s[1] = "World";
	s[2] = "test";
	
	//size of string
	System.out.println(s.length);
	System.out.println("*********************************************");
    //Object Array--- Object is superclass of all classes, Hence O is capital as its class
	//To store diff data types values --> obj array is used.
	Object obj[] = new Object[6];
	obj[0] = "Tom";
	obj[1] = 28;
	obj[2] = 12.33;
	obj[3] = "06/09/1991";
	obj[4] = 'M';
	obj[5] = "London";
	
	for (int l = 0 ; l < obj.length ; l++){
		System.out.println(obj[l]);
	}
  	
	
	
	}
}