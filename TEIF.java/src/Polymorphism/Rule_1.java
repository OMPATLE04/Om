package Polymorphism;
// while overloading a method in the child class we 
//must use an access specifier which provide the same visibility or more visibility

public class Rule_1 {
	public static void main (String []args) {
		ChildA c = new ChildA();
		c.disp();
	}

}
class ParentA{
	public void disp() {
		System.out.println("this is parent method");
	}
}
class ChildA extends ParentA{
	public void disp() {
		System.out.println("this is child method");
		
	}
}