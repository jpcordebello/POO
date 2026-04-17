public class Empresa implements Tributos {
    private String razaoSocial;
    private double rendimentos;
    public Empresa(String razaoSocial, double rendimentos) {
        this.razaoSocial = razaoSocial;
        this.rendimentos = rendimentos;
    }
    @Override
    public String toString() {
        return "Empresa [razaoSocial=" + razaoSocial + ", rendimentos=" + rendimentos + "]";
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public void setRendimentos(double rendimentos) {
        this.rendimentos = rendimentos;
    }
    @Override
    public double calcularImpostoRenda() {

        return rendimentos * irpj;
    }
    @Override
    public double calcularIcms() {
    return rendimentos * icms;
    }

    


    
}
