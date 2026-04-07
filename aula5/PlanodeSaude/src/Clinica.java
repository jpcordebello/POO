public class Clinica extends PlanodeSaude{
    private String cnpj;
    private String nome;
    
    
    public Clinica(String empresa,String cnpj, String nome) {
        super(empresa);
        this.cnpj = cnpj;
        this.nome = nome;


        
    }


    @Override
    public String toString() {
        return super.toString() + "cnpj" + cnpj + "nome" + nome;  
        
    }


    public String getCnpj() {
        return cnpj;
    }


    public String getNome() {
        return nome;
    }
    


}
