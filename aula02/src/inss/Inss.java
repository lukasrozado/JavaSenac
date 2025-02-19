package inss;

import java.util.Scanner;

public class Inss {

	public static void main(String[] args) {
		
		float salario;
		
		System.out.println("**********" + "\n" + "Digite Seu Salário: ");
		
		Scanner reader = new Scanner(System.in);
		
		salario = reader.nextFloat();
		
		reader.close();
		
		float salarioDescontado = salario - (salario * 11/100);
		
		System.out.println("**********" + "\n" + "Seu salário com o INSS já descontado é: R$" + salarioDescontado);
		
	}

}
