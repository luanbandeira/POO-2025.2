public class Gerente extends Funcionario{

    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    public void aumentaSalario(){
        setSalario(getSalario()*1.2);;
    }

    
}