public class Gerente extends Funcionario {
    private String senha;
    private String tipo;
    private int numFuncGenciados;

    public Gerente(int matricula, String nome, String cpf, double salario, String senha, String tipo,

        int numFuncGenciados) {
        super(matricula, nome, cpf, salario);
        this.senha = senha;
        this.tipo = tipo;
        this.numFuncGenciados = numFuncGenciados;
    }

    public String getSenha() {
        return senha;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumFuncGenciados() {
        return numFuncGenciados;
    }

}
