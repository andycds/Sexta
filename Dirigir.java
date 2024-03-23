import javax.swing.JOptionPane;

public class Dirigir {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Maior de idade, pode dirigir");
        } else {
            JOptionPane.showMessageDialog(null, "Menor de idade, não pode dirigir");
        }
    }
}
