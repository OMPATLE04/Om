package strings;

public class concat2 {
	public static void main(String[]args) {
		String s1= "Md_";
		String s2 ="Arsh";
		String s3=s1.concat(s2);
		String s4 = "Md_Arsh";
		
		
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
