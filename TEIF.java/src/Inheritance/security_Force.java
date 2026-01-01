package Inheritance;

public class security_Force {
		void job() {
			System.out.println("to protect nation");
		}
		void protect() {
			System.out.println("protect country");
			
		}
	}
class Army extends security_Force {
	void protect() {
			System.out.println("to protect land");
			
		}
		
	void Tank() {
		System.out.println("Use tanks");
	}
}
//-----
class Navy extends security_Force{
     void  protect() {
    	 System.out.println("to protect ocean");
		
	}
	void Ships() {
		System.out.println("Use Ships");
		
	}
}
class Airforce extends security_Force{
	void protect() {
		System.out.println("to protect Air");
		
	}
	void Jet() {
		System.out.println("Use Fighter get");
		
	}
}
