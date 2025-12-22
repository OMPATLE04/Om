package Arrays;
import java.util.*;
public class swap_index {
	public static void main (String []args) {
		int a[]= {10,20,30,40,50,60};
		Scanner sc = new Scanner (System.in);
		System.out.println("ener  index to swap ");
		int ind =sc.nextInt();
		System.out.println("ener 2nd index to swap ");
		int ind2 =sc.nextInt();
		int temp = a[ind];
		a[ind] = a[ind2];
		a[ind2]=temp;
		System.out.println("Array after swapping:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
		
		
		
	}

}
