/*7. Ler a idade de uma pessoa expressa em anos, meses e dias e exibir a idade dessa
pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. */

import javax.swing.JOptionPane;

public class Idade {
    public static void main(String[] args) {
        int anos = Integer.parseInt(JOptionPane.showInputDialog("Digite idade em anos"));
        int meses = Integer.parseInt(JOptionPane.showInputDialog("Digite os meses"));
        int dias = Integer.parseInt(JOptionPane.showInputDialog("Digite os dias"));
        int emDias = anos * 365 + meses * 30 + dias;
        JOptionPane.showMessageDialog(null, "Sua idade em dias é " + emDias);
    }
}
