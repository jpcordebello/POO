public class PessoaJuridica extends Cliente{
    private String cnpj;
    private String razaoSocial;
    private String inscEstadual;
    
    
    public PessoaJuridica(int codigo, String nome, String email, String cnpj, String razaoSocial, String inscEstadual) {
        super(codigo, nome, email);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.inscEstadual = inscEstadual;
    }

    

}
