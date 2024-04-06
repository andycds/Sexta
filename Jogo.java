public class Jogo {
	public static void main(String[] args) throws InterruptedException {
		Personagem cacador = new Personagem("Cacador", 10, 0, 0);
		Personagem soneca = new Personagem("Soneca", 10, 5, 10);
		while (true) {
			cacador.cacar();
			soneca.dormir();
			cacador.comer();
			soneca.dormir();
			cacador.dormir();
			soneca.dormir();
			cacador.cacar();
			soneca.comer();
			cacador.cacar();
			soneca.cacar();
			System.out.println("====================");
			Thread.sleep(3000);
		}
	}
}
