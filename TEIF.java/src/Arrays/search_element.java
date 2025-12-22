package Arrays;
import java.util.*;

public class search_element {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {10,20,30,40,20,50};
		System.out.println("enter number to find in array");
		int f = sc.nextInt();
		boolean found = true;
		int idx = 0;
		for(int i =0 ; i<a.length;i++) {
			if(a[i]==f) {
				found = true;
				idx = i;
				break;
			}
		}
		if(found) {
			System.out.println("key found at index :"+idx);
		}
		else {
			System.out.println("NOT FOUND");
		}
		
		// my code 
//		for(int i=0; i<a.length;i++) {
//			if(a[i]==f) {
//				System.out.println(i);
//				break;
//			}
//			
//		}
		
		
	}

}
