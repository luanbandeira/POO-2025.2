public class TesteAnimais {
    public static void main(String[] args) {
        Animal[] animais = {
            new Cachorro(),
            new Gato(),
            new Cachorro()
        };

        interagirComAnimais(animais); // chama a função
    }

    public static void interagirComAnimais(Animal[] animais) {
        for (Animal a : animais) {
            // Chama o método comum
            System.out.println(a.fazerSom());

            // Usa instanceof para descobrir a subclasse
            if (a instanceof Cachorro) {
                Cachorro c = (Cachorro) a;
                System.out.println(c.abanarRabo());
            } else if (a instanceof Gato) {
                Gato g = (Gato) a;
                System.out.println(g.arranharMovel());
            }
        }
    }
}
