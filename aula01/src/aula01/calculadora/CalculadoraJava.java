package aula01.calculadora;
import java.util.Locale;
import java.util.Scanner;


public class CalculadoraJava {
    public static void main(String[] args) {
        //Soma
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha a operação de 1 a 4");
        System.out.println("1- Soma");
        System.out.println("2- Subtracao");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão");
        int choice = input.nextInt();
        System.out.println("Digite o primeiro número: ");
        int num1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = input.nextInt();
        input.close();
        if (choice == 1 ){
            Soma soma = new Soma(num1,num2);
            System.out.println("Resultado: " + soma.CalculadoraSoma(num1,num2));
        } else if (choice == 2 ) {
            Subtracao subtracao = new Subtracao(num1, num2);
            System.out.println("Resultado: " + subtracao.CalculadoraSubtracao(num1,num2));
        } else if (choice == 3) {
            Multiplicacao multiplicacao = new Multiplicacao(num1, num2);
            System.out.println("Resultado: " + multiplicacao.CalculadoraMultiplicacao(num1, num2));
        }else if (choice == 4){
            Divisao divisao = new Divisao(num1, num2);
            System.out.println("Resultado: " + divisao.CalculadoraDivisao(num1, num2));
        }else{
            System.out.println("Valor inválido digite um valor entre 1 e 4");
        }
    }
}

