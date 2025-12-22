package Arrays;
import java.util.*;
public class generic_3D {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number of colleges");
		int n = sc.nextInt();
		System.out.print("enter number of classes");
		int m = sc.nextInt();
		System.out.print("enter number of students");
		int l= sc.nextInt();
		int a[][][] = new int[n][m][l];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println("please enter number of marks of college " +i+ "class"+j+"students"+k);
					a[i][j][k]=sc.nextInt();
				}
			}
		}
		 System.out.println("\nEntered Marks:");
	        for (int i = 0; i < n; i++) {
	            System.out.println("College " + i + ":");
	            for (int j = 0; j < m; j++) {
	                System.out.print("  Class " + j + ": ");
	                for (int k = 0; k < l; k++) {
	                    System.out.print(a[i][j][k] + " ");
	                }
	                System.out.println();
	            }
	        }
		
	}

}
