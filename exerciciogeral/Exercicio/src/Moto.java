import java.time.LocalDate;

public class Moto extends Veiculo {
    private int cilindradas;

    
    public Moto(String modelo, double valorCobrado, LocalDate dataConserto, Proprietario proprietario,
            int cilindradas) {
        super (modelo, valorCobrado, dataConserto, proprietario);
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
    return super.toString() + ", cilindradas=" + cilindradas;
}

    @Override
    public void lavarVeiculo() {
        valorCobrado+=TipoServico.LAVAGEM.getValorPorServico();
        
    }

    @Override
    public void revisao() {
        valorCobrado+=TipoServico.REVISAO.getValorPorServico();
        
    }

    @Override
    public void trocarOleo() {
        valorCobrado+=TipoServico.OLEO.getValorPorServico();
        
    }



}
