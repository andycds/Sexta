/*
 * Pergunte um número para o usuário.
 * Se o número for divisível por 4 ou por 10, imprima PIM.
 * Se não, imprima o próprio número.
 */

import javax.swing.JOptionPane;

public class PimSimples {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        if (numero % 4 == 0 || numero % 10 == 0) {
            JOptionPane.showMessageDialog(null, "PIM");
        } else {
            JOptionPane.showMessageDialog(null, "O numero e " + numero);
        }
    }
}
