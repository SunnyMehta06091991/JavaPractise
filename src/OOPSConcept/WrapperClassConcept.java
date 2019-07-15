package OOPSConcept;

public class WrapperClassConcept {

	public static void main(String[] args) {
        String x = "100";
        System.out.println(x + 20);
        
        //To convert String into integer we need to use wrapper class.
        //Integer is wrapper class and parseInt() method is used to convert into integer
        //data conversion from string to integer
        //INteger, Double, Character , Boolean all are wrapper class. 
        //String to int ---> Parse int method is used.
        // Integer.parseint(String s)
        
        //int to String --> String.valueOf(int i) method is used.
        
        
        int i = Integer.parseInt(x);
        System.out.println(i + 20);
        
        //String to double conversion
        String g = "12.33";
        double b = Double.parseDouble(g);
        System.out.println(b + 1.33);

        //String to character ---> No method available
        String s = "true";
        boolean z = Boolean.parseBoolean(s);
        System.out.println(z);
        
        //int to String conversion
        int j = 200;
        System.out.println(j + 20);
        String b1 = String.valueOf(j);
        System.out.println(b1 + 20);
		
        //INterview Question
        //AS string is not pure numeric exception it will give you number format exception.
        //It should be pure numeric value for conversion from String to numeric int.
        String u = "100A";
        int i1 = Integer.parseInt(u);
        System.out.println(i1);
	}

}
