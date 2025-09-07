public class BancoTeste {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // Cadastra clientes
        banco.cadastraClientes();

        // Executa operações e exibe resultado
        String resultado = banco.operacoes();
        System.out.println(resultado);
    }
}
