package Polymorphism;

public class TrainerApp {
	public static void main(String []args) {
		Java_T jt = new Java_T();
		Appti_T at = new Appti_T();
		Testing_T tt = new Testing_T();
		
		jt.Teach();
		at.Teach();
		tt.Teach();
		
//		Trainer t ;
//		t = new Java_T();
//		t.Teach();
//		t = new Appti_T();
//		t.Teach();
//		t = new Testing_T();
//		t.Teach();	
//		
		
	}
	

}
class Trainer{
	void Teach() {
		System.out.println(" Train uss");
		
	}
}

class Java_T{
	void Teach() {
		System.out.println(" Teaches Java");
		
	}
}

class Appti_T{
	void Teach() {
		System.out.println("Teaches Appti");
		
	}
}

class Testing_T{
	void Teach() {
		System.out.println(" Teaches Testing ");
	}
}
// in the above program polymorphism does not acheive because of Type coupling.
// type coupling refers to a procees of a child type reference reffering to a child type object.
// also in above program 3 reference program is calling one teach() method each  that jt is calling teach method of java trainer class.
// at is calling teach method of apti trainer class.
// and tt is calling teach() of testing method classs.
// hence this is 3:3 or 1:1 relationship therefore polymorphism does not exsist in the above program. 
// if polymorphism has to be acchive we must acchive loose coupling .
// loose coupling refers to the process of a parent type reference reffering to a child type object.

