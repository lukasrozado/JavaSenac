package inss;

import javax.swing.JOptionPane;

public class verificarAprovacao {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("Insira o nome do aluno: ");
		String prova1Str = JOptionPane.showInputDialog("Insira a nota da primeira prova: ");
		String prova2Str;
		float prova2 = 0;
		float prova1 = Float.parseFloat(prova1Str);
		
		if (prova1 < 0 || prova1 > 10) {
			
			JOptionPane.showMessageDialog(null, "Insira um valor de 0 à 10!");
		
		} else if (prova1 >= 0 && prova1 <= 10) {
			prova2Str = JOptionPane.showInputDialog("Insira a nota da Segunda prova: ");
			prova2 = Float.parseFloat(prova2Str);
			
			if (prova2 < 0 || prova2 > 10) {
				
				JOptionPane.showMessageDialog(null, "Insira um valor de 0 à 10!");
			
			} else if (prova2 >= 0 && prova2 <= 10) {
				
				float media = (prova1 + prova2) / 2;

				if (media < 4.5) {
					
					JOptionPane.showMessageDialog(null,
							"O Aluno " + name + "ficou com a seguinte média: " + media + "\n" + " O aluno está reprovado!");
				
				} else if (media >= 4.5 && media < 7) {
					
					JOptionPane.showMessageDialog(null,
							"O Aluno " + name + "ficou com a seguinte média: " + media + "\n" + " O aluno está em recuperação!");
				
				} else if (media >= 7) {
					
					JOptionPane.showMessageDialog(null,
							"O Aluno " + name + "ficou com a seguinte média: " + media + "\n" + " O aluno está Aprovado!");
				
				}
			} else {
				
				JOptionPane.showMessageDialog(null, "Insira um valor válido!");
			
			}
			
		} else {
			
			JOptionPane.showMessageDialog(null, "Insira um valor válido!");
		
		}
		
	}
}
