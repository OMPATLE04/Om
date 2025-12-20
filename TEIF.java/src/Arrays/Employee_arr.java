package Arrays;

import java.util.Scanner;

public class Employee_arr {
	public static void main (String []args) {
		int i =0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of Employee");
		int size = input.nextInt();
		input.nextLine();
		String emp[]=new String[size];
		while(i<emp.length) {
			System.out.println("Enter Name of Employee :" +(i+1));
			emp[i] = input.nextLine();
		
			i++;
			
		}
		for(i=0;i<emp.length;i++) {
			System.out.println("mark of student " +(i+1)+ " :"  +emp[i]);
			
			
		}
		

	}

}
