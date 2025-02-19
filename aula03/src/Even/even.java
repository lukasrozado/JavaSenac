package Even;

import java.util.Scanner;

public class even {

    // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
    // then press Enter. You can now see whitespace characters in your code.
    public static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            System.out.println("Números pares até " + numero + ":");
            for (int i = 1; i <= numero; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
            scanner.close();
            }
        }
}