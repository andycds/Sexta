import java.util.Scanner;

import javax.swing.JOptionPane;

public class Retangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a base do retângulo: ");
        double base = teclado.nextDouble();
        System.out.println("Digite a altura do retângulo: ");
        double altura = teclado.nextDouble();
        double area = base * altura;
        System.out.println("A área do retângulo é: " + area);
        teclado.close();

        // double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base
        // do retângulo"));
        // double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a
        // altura do retângulo"));
        // double area = base * altura;
        // JOptionPane.showMessageDialog(null, "A área do retângulo é: " + area);
    }
}
