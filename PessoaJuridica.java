public class PessoaJuridica  extends Cliente{
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String cnpj){
        super(nome, endereco);
        this.cnpj = cnpj;

    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return super.getNome();
    }

    @Override
    public String getEndereco() {
        // TODO Auto-generated method stub
        return super.getEndereco();
    }




}
