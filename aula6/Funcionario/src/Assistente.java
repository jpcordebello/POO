public class Assistente extends Funcionario{
    protected double adicional;

    public Assistente(int id, String nome, double salario, String tunro, Setor setor, double adicional) {
        super(id, nome, salario, tunro, setor);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    @Override
    public void reajustarSalario() {
        salario = salario *1.10;
    }

}
