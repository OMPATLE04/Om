package Arrays; 
import java.util.*;
public class jacked2D_generic {
	public static void main (String []args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("please enter the no. of classes :");
		int n = sc.nextInt();
		int a[][]=new int [n][];
		
		for(int i=0;i<n;i++) {
			System.out.print("please enter the no of student present in the class");
			int b=sc.nextInt();
			a[i]=new int[b];
		}
		System.out.print("");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
				
			}
			
		}
		//output
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+ " ");
				
			}
			System.out.println(" ");
		}
		
			
	}

}
