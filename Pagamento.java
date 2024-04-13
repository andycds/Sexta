import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Nome: ");
            String nome = sc.next();

            System.out.println("Digite o seu salário: ");
            double salario = sc.nextDouble();

            funcionarios[i] = new Funcionario(nome, salario);
        }
        double maiorsalario = 0;
        for (int i = 0; i < funcionarios.length; i++) {
            double salario = funcionarios[i].getSalario();
            if (salario > maiorsalario) {
                maiorsalario = salario;
            }
        }
        System.out.println("O maior salario é:" + maiorsalario);

        sc.close();
    }
}
