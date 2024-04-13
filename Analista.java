public class Analista extends Funcionario {

    public Analista(String nome, double salario) {
        super(nome, salario);
    }

    double bonus() {
        return getSalario() * 0.05;
    }
}
