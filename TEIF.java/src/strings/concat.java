package strings;

public class concat {
	public static void main(String[]args) {
		String s1= "Md";
		String s2 ="arsh";
		s1=s1.concat(s2);
		System.out.println(s1);
		
		
		if(s1==s2) {
			System.out.println("reference are equal");
		}
		else {
			System.out.println("reference are  not equal");
		}
		if(s1.equals(s2)) {
			System.out.println("values are equal");
		}
		else {
			System.out.println("values are  not equal");
		}
		
		
	}


}
