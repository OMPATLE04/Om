package Arrays;
import java.util.*;

public class bubble_sort{
	
	public static void main(String []args) {
		System.out.println("Bubble  sort");
		int a[]= {10,30,60,50,20,40};
		int temp=0;
		System.out.print("Array before swapping: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " "); 
        }  
        System.out.println(" ");
        for (int i = 0; i < a.length - 1; i++) {
    	    for (int j = 0; j < a.length  - 1; j--) {
    	        if (a[j] > a[j + 1]) {
    	            temp = a[j];
    	            a[j] = a[j + 1];
    	            a[j + 1] = temp;
    	        }
    	    }
    	}
		
		
			System.out.print("Array after swapping: ");
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " ");
	        }    
		
	}

	}




