import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Zoo zoo = new Zoo();
        int opcao;

        do {
            System.out.println("\n=== MENU ZOOLÓGICO ===");
            System.out.println("1. Adicionar animal");
            System.out.println("2. Listar todos os animais");
            System.out.println("3. Remover animal (por ID)");
            System.out.println("4. Emitir som de um animal (por ID)");
            System.out.println("5. Testar habilidade de um animal (por ID)");
            System.out.println("6. Sair do programa");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Qual animal deseja adicionar?");
                    System.out.println("1. Cat");
                    System.out.println("2. Dog");
                    System.out.println("3. Bird");
                    int escolha = sc.nextInt();

                    Animal novo = null;
                    if (escolha == 1) novo = new Cat();
                    else if (escolha == 2) novo = new Dog();
                    else if (escolha == 3) novo = new Bird();

                    if (novo != null) {
                        zoo.addAnimal(novo);
                        System.out.println(novo.getNome() + " foi adicionado!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Lista de Animais ---");
                    for (Animal a : zoo.listAnimals()) {
                        System.out.println(a.getId() + " | Nome: " + a.getNome() +
                                           " | Som: " + a.som() +
                                           " | Habilidades: " + a.getHabilidades());
                    }
                    break;

                case 3:
                    System.out.print("Digite o ID do animal a remover: ");
                    long idRemover = sc.nextLong();
                    boolean removido = zoo.removeAnimal(idRemover);
                    System.out.println(removido ? "Animal removido!" : "ID não encontrado.");
                    break;

                case 4:
                    System.out.print("Digite o ID do animal: ");
                    long idSom = sc.nextLong();
                    Animal encontradoSom = null;
                    for (Animal a : zoo.listAnimals()) {
                        if (a.getId() == idSom) encontradoSom = a;
                    }
                    if (encontradoSom != null) {
                        System.out.println(encontradoSom.getNome() + " faz: " + encontradoSom.som());
                    } else {
                        System.out.println("Animal não encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("Digite o ID do animal: ");
                    long idHab = sc.nextLong();
                    Animal encontradoHab = null;
                    for (Animal a : zoo.listAnimals()) {
                        if (a.getId() == idHab) encontradoHab = a;
                    }
                    if (encontradoHab != null) {
                        System.out.println(encontradoHab.getNome() + " possui habilidades: " + encontradoHab.getHabilidades());
                    } else {
                        System.out.println("Animal não encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 6);

        sc.close();
    }
}
