package Inheritance;
// cyclic inheritance is not permitted in java
public class Rule_6 {
	public static void main (String []args) {
		Child3 c = new Child3();
	}

}
class parent3 extends Child2{
	
}
class Child3 extends parent3{
	
}