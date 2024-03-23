/*Faça um programa que leia um valor N inteiro e positivo, calcule e mostre o valor de E, conforme a fórmula a seguir:
E = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N!*/

import javax.swing.JOptionPane;

public class SomaN {
    public static void main(String[] args) {
        int n = -1;
        while (n < 0) {
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor positivo de N"));
        }
        double e = 1;
        for (int i = 1; i <= n; i++) {
            int fatorial = 1;
            for (int parcFatorial = i; parcFatorial >= 2; parcFatorial--) {
                fatorial *= parcFatorial;
            }
            double parcelaSoma = 1 / (double) fatorial;
            e += parcelaSoma;
            System.out.println("i: " + i + " fatorial: " + fatorial + " parcelaSoma: " + parcelaSoma);
        }
        System.out.println("E: " + e);
    }
}
