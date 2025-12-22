package strings;

public class compare3 {
	public static void main(String[]args) {
		String s1= "Arsh";
		String s2 ="arsh";
		
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
