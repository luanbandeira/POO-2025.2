public class Pessoa {
    private String nome;
    private int idade;
    public static int contador = 0;

    public Pessoa(String nome, int idade){
        this.nome= nome;
        this.idade = idade;
        contador++;

    }
}
