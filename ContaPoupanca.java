public class ContaPoupanca extends ContaBancaria {
    private int diaDeRendimento;

    public ContaPoupanca(String cliente, int num_conta, double saldo, int diaDeRendimento){
        super(cliente, num_conta, saldo);
        this.diaDeRendimento = diaDeRendimento;
    }

    @Override
    public void setSaldo(double valor) {
        // TODO Auto-generated method stub
        super.setSaldo(valor);
    }

    @Override
    public String getCliente() {
        // TODO Auto-generated method stub
        return super.getCliente();
    }


    public void calcularNovoSaldo(double taxa, int diaDeRendimento){
        double saldo = getSaldo();
        setSaldo(saldo * (1.0 + taxa));
                
    }



}
