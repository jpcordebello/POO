public class Funcionario extends Object{
    protected int matricula;
    protected String nome;
    protected String cpf;
    protected double salario;

    public boolean autenticacao(String senha){
        return true;
    }

    public String imprimirContraCheque(){


        return "Impressao de contra-cheque";
    }

        public Funcionario(int matricula, String nome, String cpf, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    //Sobrescrever
    @Override
    public String toString() {
    return "matricula: " + matricula + "-" + "Nome: "+nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }
    public double reajustarSalario(){
        return salario= salario *1.10;
    }

}
