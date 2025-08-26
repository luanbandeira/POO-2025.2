import java.util.Scanner;
public class aula01{
    public static Scanner input = new Scanner(System.in);


    public static void main (String [] args){
        System.out.println("digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("nome inserido: " + nome);

    }

}