package Polymorphism;


public class SecurityApp {
	public static void main (String []args) {
		System.out.println("---------------ARMY--------------");
		duty(new Army());
		System.out.println("---------------NAVY--------------");
		duty(new Navy());
		System.out.println("---------------AIR FORCE--------------");
		duty(new Airforce());
	}
	static void duty(security_Force1  s) {                                      
        s.job();
        s.protect();  
        
  }   		
	}
class security_Force1 {
	void job() {
		System.out.println("to protect nation");
	}
	void protect() {
		System.out.println("protect country");
		
	}
}
class Army extends security_Force1 {
void protect() {
		System.out.println("to protect land");
		
	}
	
void Tank() {
	System.out.println("Use tanks");
}
}
//-----
class Navy extends security_Force1{
 void  protect() {
	 System.out.println("to protect ocean");
	
}
void Ships() {
	System.out.println("Use Ships");
	
}
}
class Airforce extends security_Force1{
void protect() {
	System.out.println("to protect Air");
	
}
void Jet() {
	System.out.println("Use Fighter get");
	
}
}



