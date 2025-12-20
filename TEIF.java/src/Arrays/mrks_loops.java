package Arrays;
import java.util.*;
public class mrks_loops {
	
	
	public static void main (String []args) {
	int i =0;
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number of students");
	int size = input.nextInt();
	int array[]=new int[size];
	while(i<array.length) {
		System.out.println("enter mark of student" +(i+1));
		array[i] = input.nextInt();
		i++;
		
	}
	for(i=0;i<array.length;i++) {
		System.out.println("mark of student " +(i+1)+ " :"  +array[i]);
		
		
	}
	

}
}
