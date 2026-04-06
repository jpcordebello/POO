
//variaveis de objeto 
public class Produto {
    private int codigo;
    private String nome;
    private double preco;
// alt =+ shift + f auto identacao 


// overload (sobrecarga) - Quando temos mais de um construtor ou metodo 
// com o mesmo nome e parametros diferentes 

//construtor default - ele é implicito e nao tem parametros
    public Produto(){
        System.out.println("Construtor executado!");
    }

    //construtor cheio - possui todos os atributos como parametros
    public Produto(int codigo, String nome, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        System.out.println("Construtor cheio executado");

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
