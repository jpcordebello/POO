public class PlanodeSaude {
    protected String empresa;
    protected double valor = 80;
    protected double valorISS = 5;

    public PlanodeSaude(String empresa) {
        this.empresa = empresa;
    
    }

    

    @Override
    public String toString() {
        return "PlanodeSaude [empresa=" + empresa + ", valor=" + valor + ", valorISS=" + valorISS + ", toString()="
                + super.toString() + "]";
    }



    public String getEmpresa() {
        return empresa;
    }

    public double getValor() {
        return valor;
    }

    public double getValorISS() {
        return valorISS;
    }
    public double calcularPagamento(){
        return valor = valor - valor* valorISS/100;
    }
}
