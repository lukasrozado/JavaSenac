package user;

import java.util.Locale;
import java.util.Scanner;

public class Name {

    public String getUserName() {
        // Set default locale to US
        Locale.setDefault(Locale.US);

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt the user for their name
        System.out.println("Enter your name: ");
        String name = input.nextLine();

        // Close the scanner

        // Return the name to the caller
        return name;
    }
}
