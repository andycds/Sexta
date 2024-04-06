import javax.swing.JOptionPane;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("1-Soma\n2-Subtracao\n3-Multiplicacao\n4-Divisao"));
        // quais os operandos?
        int operando1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro operando?"));
        int operando2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo operando?"));
        // para guardar o resultado
        int resultado;
        if (opcao == 1) {
            resultado = c.soma(operando1, operando2);
        } else if (opcao == 2) {
            resultado = c.subtracao(operando1, operando2);
        } else if (opcao == 3) {
            resultado = c.multiplicacao(operando1, operando2);
        } else {
            resultado = c.divisao(operando1, operando2);
        }
        // mostrando o resultado
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}
