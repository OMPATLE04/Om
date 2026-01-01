package Polymorphism;

public class Ttranning_app {
	public static void main(String []args) {
		duty(new Java_Tt());                                   //	Trainerr t ;            
		duty(new Appti_Tt());                                       //	t = new Java_Tt();
		duty(new Testing_Tt());                                      //	t.Teachh();
	}                                                           //	t = new Appti_Tt();
       static void duty(Trainerr t) {                                        //	t.Teachh();
             t.Teachh();                                              //	t = new Testing_Tt();
       }                                                        //	t.Teachh();	
	

}
class Trainerr{
	void Teachh() {
		System.out.println(" Train uss");
		
	}
}

class Java_Tt extends Trainerr{
	void Teachh() {
		System.out.println(" Teaches Java");
		
	}
}

class Appti_Tt extends Trainerr{
	void Teachh() {
		System.out.println("Teaches Appti");
		
	}
}

class Testing_Tt extends Trainerr{
	void Teachh() {
		System.out.println(" Teaches Testing ");
	}
}
