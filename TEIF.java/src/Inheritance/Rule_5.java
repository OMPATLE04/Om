package Inheritance;


//MULTILEVEL INHERITANCE
//  Allthough multiple inheritance is not allowed in java multilevel is allowed 
public class Rule_5 {
	public static void main(String[]args) {
	Child2 c = new Child2();
	System.out.println(c.a);
	System.out.println(c.b);
	}
}
class Grandparent{
	int a = 10;

}
class Parents extends Grandparent{
	int b=20;
	}
class Child2 extends Parents{
}
	
