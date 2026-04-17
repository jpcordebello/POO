public class Funcionario {
    private String nome;
    private String profissao;
    
    public Funcionario(String nome, String profissao) {
        this.nome = nome;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public String getProfissao() {
        return profissao;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", profissao=" + profissao + "]";
    }
    

    
}
