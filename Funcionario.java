public class Funcionario {
    // Escreva uma classe funcionário que tenha 2 atributos:
    // nome e salário
    // Leia e crie 5 funcionários a partir do teclado e informe o nome de quem ganha
    // mais e de quem ganha menos
    // guarde os funcionários em um vetor (array)
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
