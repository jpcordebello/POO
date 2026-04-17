import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Carro extends Veiculo implements Oficina{
    
    private String categoria;
    
    public Carro(String modelo, double valorCobrado, LocalDate dataConserto, Proprietario proprietario,
        String categoria) {
            super(modelo, valorCobrado, dataConserto, proprietario);
            this.categoria = categoria;
        }
        
        @Override
        public void lavarVeiculo() {
            valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
        }
    
        @Override
        public void revisao() {
            if (dataConserto.getMonth() ==Month.AUGUST) {
                valorCobrado+=TipoServico.REVISAO.getValorPorServico() *0.90 ;
                }else{
                    valorCobrado+=TipoServico.REVISAO.getValorPorServico();
                }
                
        }
    
    
        @Override
        public void trocarOleo() {
            if (dataConserto.getDayOfWeek() == DayOfWeek.SATURDAY) {
                valorCobrado+=TipoServico.OLEO.getValorPorServico() - 50 ;
                } else { 
                    valorCobrado+=TipoServico.OLEO.getValorPorServico() ;
                }                 
        }
    
}

