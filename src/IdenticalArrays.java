import java.util.Arrays;
import java.util.Scanner;

/**
 * IdenticalArrays is a program that prompts the user to enter two 3×3
 * arrays of integers and displays whether the two are identical. The method
 * public static boolean equals(int[][] m1, int[][] m2) is used to test the arrays.
 * </p>
 * @author Isaac Warren
 */

public class IdenticalArrays {

    public static void main(String[] args) {


        int[][] myArray1 = getArray(1);
        int[][] myArray2 = getArray(2);

        System.out.print("Array 1: ");
        System.out.println(Arrays.deepToString(myArray1));
        System.out.print("Array 2: ");
        System.out.println(Arrays.deepToString(myArray2));

         System.out.println("The two arrays are"
                 + (equals(myArray1, myArray2) ? " " :  " not ") +
                 "identical.");
    }

    /**
     * equals() checks to 2d int arrays and returns the boolean value
     * of whether they are equal
     */
    public static boolean equals(int[][] m1, int[][] m2){

        return Arrays.deepEquals(m1, m2);
    }

    /**
     * getArray creates a 3 x 3 array from user input and returns it
     */
    public static int[][] getArray(int arrayNum){

        Scanner input = new Scanner(System.in);  // Create a Scanner object
        int[][] m = new int[3][3];       // Create first array

        System.out.println("Enter " +
                (m[0].length + m[1].length + m[2].length) +
                " integers for Array " + arrayNum + ": ");

        // get values from user input
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++){
                m[row][column] = input.nextInt();
            }
        }
        return m;
    }
}
