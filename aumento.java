public class aumento {

    public static void main(String[] args) {
        Gerente g1 = new Gerente("Luan", 5000);
        Programador p1 = new Programador("Levi", 2000);


        p1.aumentaSalario();

        System.out.println(p1.getSalario());
    }

    
}