package Arrays;
import java .util.*;
public class arr_copy {
	public static void main(String []args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter size of an array");
		int size = sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter number to add in array");
			arr[i]=sc.nextInt();
		}
		int b[]=new int[arr.length];
		for(int j=0;j<b.length;j++) {
			b[j]=arr[j];
			
		}
		//copy of arr output
		System.out.println(" ");
		for(int j=0;j<b.length;j++) {
			System.out.println(b[j]);
		
	
		
	}

	}}
