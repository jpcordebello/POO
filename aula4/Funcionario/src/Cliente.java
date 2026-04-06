public class Cliente extends Object{
    protected int codigo;
    protected String nome;
    protected String email;
    
    
    public Cliente(int codigo, String nome, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
    }


    public int getCodigo() {
        return codigo;
    }


    public String getNome() {
        return nome;
    }


    public String getEmail() {
        return email;
    }

    

    

}
