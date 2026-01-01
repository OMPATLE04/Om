package Encapsulation;
import java.util.*;
public class employeeapp {
	public static void main (String []args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("please enter Employee Name");
//	String n= sc.next();
//	System.out.println("please enter Employee Id ");
//	int i = sc.nextInt();
//	System.out.println("please enter Employee Sallary");
//	int s = sc.nextInt();
	
	Employee e = new Employee("om" , 220100652 , 5000000 );
	System.out.println(e.getName());
	System.out.println(e.getId());
	System.out.println(e.getSallary());
	
	}

}
class Employee{
	private String Name;
	private int Id;
	private int Sallary;
	
	public Employee(String n, int i , int s) {
		Name = n;
		Id = i;
		Sallary = s;
	}
	
	public String getName(){
		return Name;
	}
	public int getId(){
		return Id;
	}
	public int getSallary(){
		return Sallary;
	}
}
