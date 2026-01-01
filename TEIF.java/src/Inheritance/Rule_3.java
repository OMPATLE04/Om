package Inheritance;

public class Rule_3 {
//	the constructor of a class also do not participate in inheritance
//	however the parent class constructor is called beacause of constructor chaining 
		public static void main(String[]args) {
			Child c = new Child();
			 
			
			
		}

	}
	class Parent1{
		public Parent1(){
		System.out.println("This is parent constructor");
		}
	}
	class Child extends parent{
		public Child() {
		System.out.println("this is child constructor");
	}
	}



