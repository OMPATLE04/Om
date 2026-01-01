package Inheritance;

public class constructor_behave {
	public static void main (String []args) {
		Child4 c = new Child4();
		System.out.println(c.a+" "+c.b);
		
	}

}
class parent4 {
	int a;
	int b;
	public parent4() {
		int a =10;
		int b =20;
	
    }
	public parent4(int a , int b) {
		this.a=a;
	    this.b=b;
    }
}
class Child4 extends parent4{
	public Child4() {
		a=30;
		b=40;
	
	}
	public Child4(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
}


