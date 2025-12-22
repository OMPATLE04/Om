package strings;

public class conncat3 {
	public static void main(String[]args) {
		String s1= "Md_";
		String s2 ="Arsh";
		String s3= "Md " + "Arsh";
		String s4 = "Md Arsh";
		
		
		if(s3==s4) {
			System.out.println("reference are equal");
		}
		else {
			System.out.println("reference are  not equal");
		}
		if(s3.equals(s4)) {
			System.out.println("values are equal");
		}
		else {
			System.out.println("values are  not equal");
		}
		
		
	}

}
