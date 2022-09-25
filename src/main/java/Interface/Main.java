package Interface;

public class Main {
    public static void main(String[] args) {
        Felino f = new Felino();
        Bovino b = new Bovino();

        System.out.println("Caracteristicas Felino");
        f.fazSom();
        f.comer();
        f.abrigo();

        System.out.println("Caracteristicas Bovino");
        b.fazSom();
        b.comer();
        b.abrigo();

    }


}
