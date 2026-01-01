package Encapsulation;
import java.util.*;

public class areaOf_Triangle {
	public static void main(String []args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Please enter base of a triangle");
	int b = sc.nextInt();
	System.out.println("Please enter height of a triangle");
	int h=sc.nextInt();
	Triangle  t = new Triangle( b ,  h);
	System.out.println(t.disp());
	
	
	
	
	}
}
class Triangle{
	int b;
	int h;
	static float a;
	
	public Triangle (int b, int h) {
		this.b=b;
		this.h=h;
		a=0.5f;
		
	}
	float disp() {
		float area=a*(b*h);
		return area;
	}
}
