package TEIF;
class student{
	String name;
	int age ;
	String gender;
	void study() {
		System.out.println("Student is studying");
	}

public class student_data {
	public static void main(String []args ) {
	student s1=new student();
	System.out.println("before assigning the values");
	System.out.println(s1.name);
	System.out.println(s1.age);
	System.out.println(s1.gender);
	System.out.println("After Assigning  the values");
	s1.name="Arsh";
	s1.age=23;
	s1.gender="male";
	System.out.println(s1.name);
	System.out.println(s1.age);
	System.out.println(s1.gender);
	
		
	}

}
}
