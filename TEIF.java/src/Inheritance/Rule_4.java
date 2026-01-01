package Inheritance;

public class Rule_4 {

		public static void main(String[]args) {
			Child1 c = new Child1();
			 
			
			
		}

	}
	class Parent2{
		int a = 10;
		public Parent2(){
		System.out.println("This is parent constructor");
		}
	}
	class Parent3{
		int b=20;
		public Parent3(){
		System.out.println("This is parent constructor");
		}
	}
	class Child1 extends Parent2,Parent3{
		public Child1() {
		System.out.println("this is child constructor");
	}
	}






