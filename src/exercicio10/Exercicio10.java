package exercicio10;

import javax.swing.JOptionPane;
public class Exercicio10 {
    public static void main(String[] args) {
			int numero1, numero2, resultado;
			numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:"));
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:"));
			
			resultado = numero1 + numero2;
			if(resultado>10) {
				JOptionPane.showMessageDialog(null, "O resultado é: " +resultado);
				}
			}
		}