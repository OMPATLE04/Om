package strings;

public class intern_method {
	public static void main(String[]args) {
		String s1=new String("Deep");
		String s2=s1.intern();//cp me move krta hai
		String s3 =s1.intern();
		
		if(s2==s3) {
			System.out.println("reference are equal");
		}
		else {
			System.out.println("reference are  not equal");
		}
		if(s2.equals(s3)) {
			System.out.println("values are equal");
		}
		else {
			System.out.println("values are  not equal");
		}
		
		
	}

}
