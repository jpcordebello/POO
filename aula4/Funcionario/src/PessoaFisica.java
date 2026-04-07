public class PessoaFisica extends Cliente{

    private String cpf;
    private String rg;
    
    public PessoaFisica(int codigo, String nome, String email, String cpf, String rg) {
        super(codigo, nome, email);
        this.cpf = cpf;
        this.rg = rg;
    }

    

}
