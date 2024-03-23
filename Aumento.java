/*Um funcionário de uma empresa recebe aumento salarial anualmente. Sabe-se que:
a) esse funcionário foi contratado em 2005, com salário inicial de R$ 1.000,00;
b) em 2006 recebeu aumento de 1,5% sobre o salário inicial;
c) a partir de 2007 (inclusive), os aumentos salariais sempre corresponderam ao dobro do percentual do ano anterior.
Faça um programa que determine o salário atual desse funcionário. */
public class Aumento {
    public static void main(String[] args) {
        double salario = 1000;
        double porcentagemAumento = 1.5;
        double aumento;
        for (int ano = 2006; ano <= 2024; ano++) {
            aumento = salario * (porcentagemAumento / 100);
            salario += aumento;
            System.out.println("Ano: " + ano + " % : " + porcentagemAumento + " aumento: " + aumento
                    + " salário: " + salario);
            porcentagemAumento *= 2;
        }
    }
}
