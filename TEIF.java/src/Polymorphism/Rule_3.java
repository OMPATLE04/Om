package Polymorphism;
// the overrider method in the child class have a different data type as a class method
// provided that the return type share a relation ship also known as covarient return type

public class Rule_3 {
	public static void main(String[] args) {

		Rule_3 obj = new Rule_3();

		Parent p = obj.new ChildC();   // inner class ka object
		Animal1 a = p.disp();           // method call
		a.sound();                     // print yahin se hoga
	}
	class Parent{
		Animal1 disp() {
			System.out.println("Parent disp() method");
			Animal1 a = new Animal1();
			return a;
		
		}
	}
class ChildC extends Parent{
	Dog disp() {
	System.out.println("Child disp() method");
	Dog d =  new Dog();
		return d;
	}
}
class Animal1 {
	void sound() {
		System.out.println("Animal sound");
	}
}
class Dog extends Animal1{
	void sound() {
		System.out.println("Dog sound");
	}
	
}

}
