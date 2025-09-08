// 9/7/25
//sn

// A program to find the largest of three integers using nested if statements.

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for three integers
        System.out.print("Enter first integer (num1): ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer (num2): ");
        int num2 = input.nextInt();

        System.out.print("Enter third integer (num3): ");
        int num3 = input.nextInt();

        int largest;

        // Nested if statements to find the largest
        if (num1 >= num2) {
            if (num1 >= num3) {
                largest = num1;
            } else {
                largest = num3;
            }
        } else {
            if (num2 >= num3) {
                largest = num2;
            } else {
                largest = num3;
            }
        }

        // Detailed output
        System.out.println("\nYou entered " + num1 + " for num1, " + num2 + " for num2, and " + num3 + " for num3.");
        System.out.println("You entered the value " + largest + " and that was the largest of the three integers!");

        input.close();
    }
}
