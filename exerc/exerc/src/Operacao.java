public class Operacao implements Livraria {
    private String tipo;
    private double valorOperacao;
    private Livro livro;

    public Operacao(String tipo, Livro livro) {
        this.tipo = tipo;
        this.livro = livro;
    }

    public Livro getLivro() {
        return livro;
    }

    @Override
    public String toString() {
        return "Operacao [tipo=" + tipo + ", valorOperacao=" + valorOperacao + ", livro=" + livro + "]";
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValorOperacao() {
        return valorOperacao;
    }

    @Override
    public void venderLivro() {
        valorOperacao= livro.getValor()* 1.09;
    }

    @Override
    public void emprestarLivro() {
    valorOperacao = (livro.getValor()*0.02)+taxaEmprestimo;
    }

    

}
