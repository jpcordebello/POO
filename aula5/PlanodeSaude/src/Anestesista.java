public class Anestesista extends Medicos {
    private String tipoAnestesista;

    public Anestesista(String empresa,String crm, String nome, String tipoAnestesista) {
        super(empresa,crm, nome);
        this.tipoAnestesista = tipoAnestesista;
    }

    @Override
    public String toString() {
        return super.toString() + "tipoAnestesista" + tipoAnestesista;
        
    }

    public String getTipoAnestesista() {
        return tipoAnestesista;
    }

    @Override
    public double calcularPagamento() {
    return valor = super.calcularPagamento()+1500;
    }
    
    

    


}
