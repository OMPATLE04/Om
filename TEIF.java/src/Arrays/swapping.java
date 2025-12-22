package Arrays;
import java.util.*;

public class swapping {
	
	public static void main(String []args) {
		System.out.println("Selection sort");
		int a[]= {10,30,60,50,20,40};
		int temp=0;
		System.out.print("Array before swapping: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " "); 
        }  
        System.out.println(" ");
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				}
				
			}
		}	
			System.out.print("Array after swapping: ");
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " ");
	        }    
		
	}

	}
