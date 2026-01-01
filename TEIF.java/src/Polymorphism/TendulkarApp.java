package Polymorphism;

public class TendulkarApp {
	public static void made (String []args) {
		Tendulkar t = new ArjunTendulkar();
		t.job();
		t.profession();
	   // t.smoke();    // ye use nahi kr sakte because vo parent ke bass nahi hai    LIMITATION OF PARENT TYPE REFFERENCE
		((ArjunTendulkar)t).smoke();
	}

}
class Tendulkar{
	void job() {
		System.out.println("Play cricket");
	}
	void profession() {
		System.out.println("He is a batsman");
		
	}
}
class ArjunTendulkar extends Tendulkar{
	
	void profession() {
		System.out.println("He is a baller");
		
	}
	void smoke() {
		System.out.println("he smoke some times");
	}
}
