public class Calculadora {
    public int soma(int a, int b) {
        return a + b;
    }

    public float soma(float a, float b) {
        return a + b;
    }

    public int soma(String a, String b) {
        int n1 = Integer.parseInt(a);
        int n2 = Integer.parseInt(b);
        return n1 + n2;
    }

    public int soma(int a, int b, int c) {
        return a + b + c;
    }

    public int soma(String a, int b) {
        return Integer.parseInt(a) + b;
    }

    public int soma(int a, String b) {
        return a + Integer.parseInt(b);
    }

    public int subtracao(int a, int b) {
        return a - b;
    }

    public int multiplicacao(int a, int b) {
        return a * b;
    }

    public int divisao(int a, int b) {
        return a / b;
    }
}
