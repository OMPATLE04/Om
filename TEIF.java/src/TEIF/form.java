package TEIF;
import java.util.*;

public class form {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		System.out.println("STUDENT FORM");
		System.out.print("Name : ");
		String n = input.nextLine();
		System.out.print("Age : ");
		int a = input.nextInt();
	    input.nextLine();
		System.out.print("Gender: ");
		String g = input.nextLine();
		System.out.print("MOB No. : ");
		String m = input.nextLine();
		System.out.print("Address : ");
		String q = input.nextLine();
		System.out.print("College Id : ");
		long c = input.nextLong();
		input.nextLine();
		System.out.print("College Name: ");
		String w = input.nextLine();
		System.out.print("Adhar No: ");
		long e = input.nextLong();
		input.nextLine();
		System.out.print("Email: ");
		String r = input.nextLine();
		
		
		System.out.println("This is studen data");
		System.out.println( "Student name :"+ n);
		System.out.println("Studant Age :"+a);
		System.out.println("Student Gender: " +g);
		System.out.println("Student Mob No. :"+m);
		System.out.println("Student Address :" +q);
		System.out.println("Student College Id : "+c);
		System.out.println("Student College Name "+w);
		System.out.println("Student Adhar No :" +e);
		System.out.println("Student Email  :" +r);
		
		
		
		
		
		
		
		
		
	}
	
  
}
