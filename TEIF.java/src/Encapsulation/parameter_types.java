package Encapsulation;

public class parameter_types {
	public static void main (String []args) {
		Employeee e = new Employeee();
		
	}

}
class Employeee{
	int emp_id;
	String name;
	int salary;
	
	public Employeee() {
		this (101,"Arsh",20);
		System.out.println("o parameterized constructor");
		
	}
	public Employeee(int emp_id) {

		System.out.println("1  parameterized constructor");
	}
	public Employeee(int imp_id, String name ) {
		this (101);
		System.out.println("2 parameterized constructor");
	}
	public Employeee(int emp_id,String name , int salary) {
		this (101,"Arsh");
		System.out.println("3 parameterized constructor");
	}
	
}
