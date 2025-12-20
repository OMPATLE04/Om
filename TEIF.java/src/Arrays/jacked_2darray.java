package Arrays;

import java.util.*;
public class jacked_2darray {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int arr[][]=new int[3][];
		arr[0] = new int [4];
		arr[1] = new int [2];
		arr[2] = new int [3];
		for(int i=0;i<arr.length;i++) { //(int i =0 ; arr.length;i++)  generic code 
			for(int j=0; j<arr[i].length;j++) { // (int j =0 ; arr[i].length;j++) 
				System.out.println("Please enter the mark of" + " :" +(i)+ " "+(j));
			    arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
			    System.out.print(arr[i][j] + " ");
			}
			System.out.println( );
		}		
		
		
		
	}


}
