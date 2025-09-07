public class ContaBancaria {
    private String cliente;
    private int num_conta;
    private double saldo;

    
    
    public ContaBancaria(String cliente, int num_conta, double saldo){
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldo;

    }
    
    public void setSaldo(double valor){
        saldo = valor;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getCliente(){
        return cliente;
    }
    

    public  boolean sacar(double valor){
        double saldo = getSaldo();
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("valor depositado com sucesso!");
        }else{
            System.out.println("valor não aceito");
        }
    }
}
