package user;

import java.util.Locale;
import java.util.Scanner;

public class Cpf {
    public String getUserCpf() {
        // Set default locale to US
        Locale.setDefault(Locale.US);

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt the user for their name
        System.out.println("Enter your CPF: ");
        String cpf = input.nextLine();

        // Return the name to the caller
        return cpf;
    }
}
