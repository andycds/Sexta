public class NovoJogo {
    public static void main (String[] args) {
        Personagem heroi = new Personagem("Thor", 10, 5, 0);

        Personagem vilao = new Personagem("Thanos", 100, 0, 5);

        System.out.println("meu heroi: " + heroi.getNome() + "\nenergia: " + heroi.getEnergia() + "\nfome: " + heroi.getFome() + "\nsono: " + heroi.getSono() + "\n");

        System.out.println("o vilao: " + vilao.getNome() + "\nenergia: " + vilao.getEnergia() + "\nfome: " + vilao.getFome() + "\nsono: " + vilao.getSono() + "\n");

        heroi.setEnergia(200);
        heroi.setSono(-1);
        System.out.println("meu heroi: " + heroi.getNome() + "\nenergia: " + heroi.getEnergia() + "\nfome: " + heroi.getFome() + "\nsono: " + heroi.getSono() + "\n");

    }
}
