package OOPSConcept;

public class CallByrefCallByValue {
    int p;
    int q;
	public static void main(String[] args) {
    	CallByrefCallByValue obj = new CallByrefCallByValue();
    	//obj.testSum(10, 20);
	    int x = 10;
	    int y = 20;
	    obj.testSum(x, y);//CallbyValue or pass by values.....
        obj.p = 30;
        obj.q = 40;
        obj.swap(obj);
	}
    
    public int testSum(int a , int b){
    	a = 30; // it will override the new values of a and b.
    	b = 40;
    	int c = a+b;
    	return c;
    }
    //CallByreference
    public void swap(CallByrefCallByValue t){
    	System.out.println(t.p);
    	System.out.println(t.q);
    	int temp;
    	temp = t.p;
    	t.p = t.q;
    	t.q = temp;
    	System.out.println("*****************************");
    	System.out.println(t.p);
    	System.out.println(t.q);
    	
    }
}
