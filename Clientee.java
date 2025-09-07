public class Clientee {
    private String nome;
    private String cpf;
    private int saldo;
    private int numConta;

    // Construtor completo
    public Clientee(String nome, String cpf, int saldo, int numConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numConta = numConta;
    }

    // Construtor conta zerada
    public Clientee(String nome, String cpf, int numConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0;
        this.numConta = numConta;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    // Métodos da conta
    public int extrato() {
        return saldo;
    }

    public void saque(int val) {
        this.saldo -= val;
    }

    public void deposito(int val) {
        this.saldo += val;
    }

    // toString
    @Override
    public String toString() {
        return "Cliente: " + nome + "\nCPF: " + cpf + 
               "\nConta: " + numConta + 
               "\nSaldo: " + saldo;
    }
}
