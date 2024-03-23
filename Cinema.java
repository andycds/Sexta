/*
 * Você foi contratado por um cinema para realizar um programa que calcula o valor do ingresso, a partir da idade:
 * se menor de 2 anos, grátis
 * até 18 anos, paga meia
 * com 65 anos ou maior, paga meia
 * O programa deve perguntar além da idade, o preço do ingresso integral para realizar seus cálculos
 */

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o valor do ingresso?");
        double valorIngresso = leitor.nextDouble();
        System.out.println("Digite a sua idade");
        int idade = leitor.nextInt();
        if (idade < 2) {
            System.out.println("Valor: grátis");
        } else if (idade < 18 || idade >= 65) {
            System.out.println("Valor: " + valorIngresso / 2);
        } else {
            System.out.println("Valor: " + valorIngresso);
        }
        leitor.close();
    }
}
