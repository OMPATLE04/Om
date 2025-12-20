package Arrays;
import java.util.*;
public class student2_D {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of class ");
		int row = sc.nextInt();
		System.out.println("enter number of stdents");
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		
		for(int i=0;i<arr.length;i++) { //(int i =0 ; arr.length;i++)  generic code 
			for(int j=0; j<arr[i].length;j++) { // (int j =0 ; arr[i].length;j++) 
				System.out.println("Please enter the mark of" + " :" +(i)+ " "+(j));
			    arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0; j<col;j++) {
			    System.out.print(arr[i][j] + " ");
			}
			System.out.println( );
		}		
	}

}
