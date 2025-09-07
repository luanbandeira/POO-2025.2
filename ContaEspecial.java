public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(String cliente, int num_conta, double saldo, double limite){
        super(cliente, num_conta, saldo);
        this.limite = limite;
    }

    @Override
    public double getSaldo() {
        // TODO Auto-generated method stub
        return super.getSaldo();
    }

    

    public  boolean sacar(double valor, double limite){
        double saldo = getSaldo();
        if (valor > 0 && valor <= (limite + saldo)) {
            setSaldo(saldo -= valor); 
            return true;
        }else{
            return false;
        }
    }

}
