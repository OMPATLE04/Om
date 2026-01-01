package Inheritance;

public class playerApp {
	public static void main(String[] args) {

		// FootBall class ka object create kiya
		FootBall fb = new FootBall("Messi", 36, "Male", 800, 350);

		// Output print kar rahe hain
		System.out.println("Player Name   : " + fb.getName());
		System.out.println("Age           : " + fb.age);
		System.out.println("Gender        : " + fb.gender);
		System.out.println("Total Goals   : " + fb.getgoals());
		System.out.println("Total Assists : " + fb.getAssists());
	}
}

