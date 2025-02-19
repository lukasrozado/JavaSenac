package inss;
import javax.swing.JOptionPane;
public class JoptionPane {

	public static void main(String[] args) {
		
		
		String salario = JOptionPane.showInputDialog("Digite Seu Salário");
		
		float salarioFloat = Float.parseFloat(salario);
		
		float Inss = (float) (salarioFloat * 0.11);
		
		float salarioDescontado = salarioFloat - Inss;
		
		JOptionPane.showMessageDialog(null, "Valor do Salário: " + salario + "\n" +
											"valor do INSS: " + Inss + "\n" +
											"valor do Salário já descontado: " + salarioDescontado + "\n"
				);
	
	}

}


