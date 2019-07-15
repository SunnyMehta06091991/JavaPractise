package JavaBasics;

public class Loops {

	public static void main(String[] args) {
		// if you are writing the same code again and again you need to use loops.
		//1.)While loop
		//disadvantage-->infinite loop if no incremental/decremental operator provided
		int i = 1;
		while (i<=10){
			System.out.println(i);
			i++;
		}
		System.out.println("********");
		//2. For Loop.
		//initialization, condition , incremental part.
		for(int j = 1 ; j <=10 ; j++){
			System.out.println(j);
		}

		System.out.println("****************");
		System.out.println("****************");
		//print 10 to 1.
		int k = 10;
		while (k >= 1){
			System.out.println(k);
			k--;
		}
		
		System.out.println("****************");
		System.out.println("****************");

		for (int l = 10 ; l >= 1 ; l--){
			System.out.println(l);
		}
		
	}

}
