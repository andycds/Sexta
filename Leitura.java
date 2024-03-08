import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int a = sc.nextInt();
        System.out.println("O quadrado é: " + a * a);
        sc.close();
    }
}
