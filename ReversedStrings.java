// 9/7/25
//s.n
// ReversedStrings.java
// A simple program that takes user input and reverses it.
import java.util.Scanner;

public class ReversedStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for a string
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(userInput).reverse().toString();

        // Output the result
        System.out.println("Reversed string: " + reversed);

        input.close();
    }
}
