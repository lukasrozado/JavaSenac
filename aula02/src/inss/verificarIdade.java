package inss;

import javax.swing.JOptionPane;

public class verificarIdade {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("Insira seu nome: ");
		String ageStr = JOptionPane.showInputDialog("Insira sua idade: ");

		byte age = Byte.parseByte(ageStr);

		if (age <= 0) {
			
			JOptionPane.showMessageDialog(null, "Vai nascer primeiro, depois vem aqui!");

		} else if(age > 0 && age < 18) {
			
			JOptionPane.showMessageDialog(null, "Menor de idade, não beba e nem use drogas!");
			
		} else if(age >= 18 && age < 65) {
		
			
			JOptionPane.showMessageDialog(null, "!");
		}
		

	}
}
