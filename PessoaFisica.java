public class PessoaFisica extends Cliente {
    private String cpf;


    public PessoaFisica(String nome, String endereco, String cpf){
        super(nome, endereco);
        this.cpf = cpf;
    }

    @Override
    public String getEndereco() {
        return super.getEndereco();
    }

    @Override
    public String getNome() {
        
        return super.getNome();
    }
}
