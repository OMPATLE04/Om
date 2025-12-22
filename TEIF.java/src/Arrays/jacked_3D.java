package Arrays;
import java.util.*;

public class jacked_3D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to 3D Jagged Array");
        System.out.println("Enter number of colleges:");
        int n = sc.nextInt();

        int arr[][][] = new int[n][][];

        // College loop
        for (int i = 0; i < arr.length; i++) {

            System.out.println("Enter number of classes for college " + i + ":");
            int classes = sc.nextInt();
            arr[i] = new int[classes][];

            // Class loop
            for (int j = 0; j < arr[i].length; j++) {

                System.out.println("Enter number of students for college " + i + " class " + j + ":");
                int students = sc.nextInt();
                arr[i][j] = new int[students];

                // Student loop (values input)
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("Enter marks of student " + k + ":");
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        // Printing 3D Jagged Array
        System.out.println("\n--- Data Entered ---");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

