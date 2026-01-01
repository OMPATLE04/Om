package Inheritance;

public class Rule_2 {
	public static void main(String[]args) {
		Child1 c = new Child1();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println("------------------------------");
		c.disp();  // rule 2 :-  if Private member of a class does not participate in inheritance
		
		
	}

}
class parent {
	int a=10;
    int b=20;
   private void disp() { // rule 2 :-  if Private member of a class does not participate in inheritance
    	System.out.println(a);
    	System.out.println(b);
    	
    }
}
class Child1 extends parent{
	
}


