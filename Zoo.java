import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    // adiciona um animal à lista
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    // retorna a lista de animais
    public ArrayList<Animal> listAnimals() {
        return animals;
    }

    // remove um animal pelo ID
    public boolean removeAnimal(long id) {
        for (Animal a : animals) {
            if (a.getId() == id) {
                animals.remove(a);
                return true; // removeu com sucesso
            }
        }
        return false; // não encontrou animal com o ID
    }
}
