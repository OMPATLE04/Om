package TEIF;

public class StudentApp {
	public static void main (String[] args) {
		students s1 = new students();
		s1.name = "om";
		s1.age = 21;
		s1.collegeId = 220100652;
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.collegeId);
		s1.study();
		
	}

}
