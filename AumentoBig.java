/*Um funcionário de uma empresa recebe aumento salarial anualmente. Sabe-se que:
a) esse funcionário foi contratado em 2005, com salário inicial de R$ 1.000,00;
b) em 2006 recebeu aumento de 1,5% sobre o salário inicial;
c) a partir de 2007 (inclusive), os aumentos salariais sempre corresponderam ao dobro do percentual do ano anterior.
Faça um programa que determine o salário atual desse funcionário. */

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AumentoBig {
    public static void main(String[] args) {
        BigDecimal salario = new BigDecimal(1000.00);
        BigDecimal porcentagemAumento = new BigDecimal(1.5);
        BigDecimal aumento;
        for (int ano = 2006; ano <= 2024; ano++) {
            aumento = salario.multiply((porcentagemAumento.divide(BigDecimal.valueOf(100))));
            salario = salario.add(aumento);
            System.out.println("Ano: " + ano + " % : " + porcentagemAumento + " aumento: " + aumento.setScale(2,
                    RoundingMode.HALF_EVEN)
                    + " salário: " + salario.setScale(2, RoundingMode.HALF_EVEN));
            porcentagemAumento = porcentagemAumento.multiply(BigDecimal.valueOf(2));
        }
    }
}
