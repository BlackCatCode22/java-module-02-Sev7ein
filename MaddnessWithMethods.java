// 9/7/25
//s.n
// Simple example using methods in Java

import java.util.Scanner;

public class MaddnessWithMethods {

    // Method to get an integer from the user
    public static int getAnIntFromTheUser(Scanner input) {
        System.out.print("Enter an integer: ");
        return input.nextInt();
    }

    // Method to compare two integers
    public static void compareTwoInts(int a, int b) {
        if (a > b) {
            System.out.println(a + " is larger than " + b);
        } else if (b > a) {
            System.out.println(b + " is larger than " + a);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }

    // Method to return the sum of two integers
    public static int sumTwoInts(int a, int b) {
        return a + b;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = getAnIntFromTheUser(input);
        int num2 = getAnIntFromTheUser(input);

        compareTwoInts(num1, num2);

        int total = sumTwoInts(num1, num2);
        System.out.println("The sum is: " + total);

        input.close();
    }
}
