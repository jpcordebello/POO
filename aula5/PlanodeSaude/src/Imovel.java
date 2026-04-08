public class Imovel {
    private String tipo;
    private String endereco;
    private double valor;
    // relacionamento entre classes
    private Proprietario proprietario;

    public Imovel(String tipo, String endereco, double valor, Proprietario proprietario) {
        this.tipo = tipo;
        this.endereco = endereco;
        this.valor = valor;
        this.proprietario = proprietario;
    }

    

    @Override
    public String toString() {
        return "Imovel [tipo:" + tipo + ", endereco:" 
        + endereco + ", valor:" + valor + ", proprietario:"
        + proprietario;
    }



    public String getTipo() {
        return tipo;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getValor() {
        return valor;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

}
