public class Heranca {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("luan", "av boa viagem");

        PessoaFisica p1 = new PessoaFisica("luan", "av boa viagem", "23");

        System.out.println(p1.getEndereco());
    }
}
