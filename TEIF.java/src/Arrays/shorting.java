package Arrays;
import java.util.*;

public class shorting {
	public static void main(String []args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter element to find :");
		int key = sc.nextInt();
		int a[]= {10,20,30,40,50};
		int low = 0;
		int high = a.length-1;
		int mid = (low + high)/2;
		boolean found=true;
		int idx = 0;
		while (low<=high) {
			if(a[mid]==key) {
				found=true;
				idx=mid;
				break;
			}
			else if (key<a[mid]){
				high=mid-1;
				mid=(low-high)/2;			
			}
			else {
				low=mid+1;
				mid=(low+high)/2;
			}
		}
		if(found) {
			System.out.println(key+" key is found at index: "+idx);
		}
		else {
			System.out.println(key+" key is not found ");
		}
		
		
		
		
		
	}

}
