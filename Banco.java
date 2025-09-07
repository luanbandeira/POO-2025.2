public class Banco {
    private Clientee clientes[];

    // Construtor cria vetor de clientes com tamanho 2
    public Banco() {
        clientes = new Clientee[2];
    }

    // Getter
    public Clientee[] getClientes() {
        return clientes;
    }

    // Cadastra os clientes c1 e c2
    public Clientee[] cadastraClientes() {
        Clientee c1 = new Clientee("Alan Turing", "1289", 1500, 25896);
        Clientee c2 = new Clientee("Ada Love", "98765431", 12345);

        clientes[0] = c1;
        clientes[1] = c2;

        return clientes;
    }

    // Executa operações
    public String operacoes() {
        for (Clientee c : clientes) {
            c.saque(100);   // saque R$100
            c.deposito(50); // deposito R$50

            // se saldo negativo, zera
            if (c.extrato() < 0) {
                c.setSaldo(0);
            }
        }

        // Alterações manuais
        clientes[1].setNome("Ada Lovelace");
        clientes[0].setCpf("12345689");

        // Monta resultado
        StringBuilder sb = new StringBuilder();
        for (Clientee c : clientes) {
            sb.append(c.toString()).append("\n");
        }

        return sb.toString();
    }
}
