package OOPSConceptPart2;

//BMW is child class/parent class
//Car is super class/parent class
public class BMW extends Car {
      
	public void start(){//overridden method
		System.out.println("BMW ... Start method");
	}
	
	public void theftSafety(){
		System.out.println("BMW... TheftSafety");
	}
}
