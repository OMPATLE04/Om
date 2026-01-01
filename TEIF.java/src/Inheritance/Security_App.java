package Inheritance;

public class Security_App {
	public static void main (String []args) {
		Army a = new Army();
		Navy n = new Navy();
		Airforce f = new Airforce();
		System.out.println("---------------ARMY--------------");
		a.job();
		a.protect();
		a.Tank();
		System.out.println("---------------NAVY--------------");
		n.job();
		n.protect();
		n.Ships();
		System.out.println("---------------AIR FORCE--------------");
		f.job();
		f.protect();
		f.Jet();
		
		
		
	}

}
