// abstract nao pode ter instancias
public abstract class Funcionario {
    protected int id;
    protected String nome;
    protected double salario;
    protected String tunro;
    protected Setor setor;

    public Funcionario(int id, String nome, double salario, String tunro, Setor setor) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.tunro = tunro;
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Funcionario [id=" + id + ", nome=" + nome + ", salario=" + salario + ", tunro=" + tunro + ", setor="
                + setor + "]";
    }


    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getTunro() {
        return tunro;
    }

    public Setor getSetor() {
        return setor;
    }

    //Método abstrato - obriga os filhos a implementarem o codigo do metodo
    //na classe super temos somente a assinatura do metodo sem corpo

    public abstract void reajustarSalario (){
        
    }

}
