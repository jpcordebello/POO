public class Produto {
    private String descricao;
    private double valor;
    private int quantidade;

    public Produto (String descricao, double valor, int quantidade){
    this.descricao=descricao;
    this.valor=valor;
    this.quantidade=quantidade;


    }

    public double calcularTotal(){
        return valor*quantidade;
    }
    public double calcularIcms(){
        return calcularTotal()*0.12;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
    



    
}

