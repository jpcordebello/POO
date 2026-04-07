public class Medicos extends PlanodeSaude {

    protected String crm;
    protected String nome;

    public Medicos(String empresa,String crm, String nome) {
        super(empresa);
        this.crm = crm;
        this.nome = nome;

    }

    @Override
    public String toString() {
        return super.toString() + "crm" + crm + "nome" + nome;
    }

    public String getCrm() {
        return crm;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public double calcularPagamento() {
        return valor = super.calcularPagamento() * 1.10;
    }

}
