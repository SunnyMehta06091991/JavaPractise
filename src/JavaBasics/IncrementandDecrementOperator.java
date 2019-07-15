package JavaBasics;

public class IncrementandDecrementOperator {
   
	public static void main(String[] args) {
		int i = 1;
		int j = i++;   //post increment -- Give value of i to j first and then increase value of i
		// in this case value of i will be given to j and then value of i will be incremented
		System.out.println(i);
		System.out.println(j);
		
		int a = 1;
		int b = ++a;
		System.out.println(a);
		System.out.println(b);
	}
}
