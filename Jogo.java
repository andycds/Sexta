public class Jogo {
    public static void main(String[] args) throws InterruptedException {
        Personagem cacador = new Personagem("John", 10, 0, 0);

        while (true) {
            cacador.cacar();
            cacador.comer();
            cacador.dormir();
            cacador.cacar();
            cacador.cacar();
            cacador.cacar();
            System.out.println("====================");
            Thread.sleep(2000);
        }
    }
}
