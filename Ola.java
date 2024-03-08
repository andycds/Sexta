import javax.swing.JOptionPane;

public class Ola {
    public static void main(String[] args) {
        // Escreva um programa que peça 2 números e apresente
        // a sua soma
        double primeiro = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1o número"));
        String segundoComoTexto = JOptionPane.showInputDialog("Digite o 2o número");
        double segundo = Double.parseDouble(segundoComoTexto);
        double somatoria = primeiro + segundo;
        JOptionPane.showMessageDialog(null, "A soma é: " + somatoria);
    }
}