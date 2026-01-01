package Encapsulation;
// overload main method 

public class demo {
		 public static void main(String [] args) {
				System.out.println("Hello");
				demo.main(7);
				int ar[]= {10,20,30,40};
				demo.main(ar);
			}
			 public static void main(int a) {
				 System.out.println("accepting any arg"+a);
			 }
			 public static void main(int [] b) {
				System.out.println("another arg " +b[2]);
			}
	 }
	
	
	
//	 final synchronized public static void main(String ...args) {
//		System.out.println("Hello");
	
//	 public static void main(String[] args) {
//	        System.out.println("Original main method");
//	        main(10);
//	        main('G');
//	        }
//
//	    public static void main(int a) {
//	        System.out.println("Overloaded main with int: " +a );
//	    }
//
//	    public static void main(char msg) {
//	        System.out.println("Overloaded main with String: " + msg);
//	    }
//	


