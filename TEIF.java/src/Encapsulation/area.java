package Encapsulation;

public class area {
	public static void main (String []args) {
		circle c = new circle(4  );
		System.out.print(c.Disp());
		
		
		
	}

}

class circle {
	int r;
	static float pi ;
	


public circle(int r){
	pi=3.14f;
	this.r=r;
	
	
	
	
}
 float Disp(){
	 float ar=pi*(r*r);
	 return ar;
	  
}
}

//1 .such variables whose values is going to stay the same regardless of the object shoud be declared as static 
//
//2. such variable whose value is different for diffrent object can be created as instance .

