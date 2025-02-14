package aula01;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.nextLine();
        sc.close();
        System.out.print(text);
    }
}