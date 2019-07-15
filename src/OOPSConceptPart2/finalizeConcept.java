package OOPSConceptPart2;

public class finalizeConcept {

	public void finalize(){
		System.out.println("finalize method");
	}
	//Basically used for clean up process in GC.
	public static void main(String[] args) {
		finalizeConcept f1 = new finalizeConcept();
		finalizeConcept f2 = new finalizeConcept();
		
		f1 = null;
		f2 = null; //There is not reference would be available in java memory.
		
		//GC will come inside memory, will check which object has no object reference GC will destroy all objects
		//Finalize keyword is used to clean up memory function
		//Use of Finalize method is before gc for clean-up processing of object.
		System.gc();//
	}
}
