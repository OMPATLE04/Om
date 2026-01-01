package Polymorphism;

public class Rule_2 {
	//while overriding a method the return type of a method in the child class must be same as the 
	//corresponding method in the parent class.
	public static void main (String []args) {
		ChildB c = new ChildB();
		c.disp();
	}

}
class ParentB{
	void disp() {
		System.out.println("this is parent method");
	}
}
class ChildB extends ParentB{
	int disp() {        
		System.out.println("this is child method");
		
	}
}
// error because of parent void return kr ra hai to child bhi void hi krega

