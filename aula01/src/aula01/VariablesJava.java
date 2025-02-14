package aula01;
import java.util.Locale;
import java.util.Scanner;

public class VariablesJava {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        boolean student = true;
        System.out.println("Digite o seu nome: ");
        String name = input.nextLine();
        System.out.println("Digite a sua idade: ");
        byte age = input.nextByte();
        System.out.println("Digite a sua altura: ");
        float height = input.nextFloat();
        input.nextLine();
        System.out.println("Digite M ou F para o sexo: ");
        char sex = input.next().charAt(0);
        input.close();
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Altura: " + height);
        System.out.println("Sexo: " + sex);
        System.out.println("Estudante:" + student);
    }
}