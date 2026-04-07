public class ControlePagamento {
    private double totalPago;

    public double getTotalPago() {
        return totalPago;
    }

    public void calcularTotalPago(PlanodeSaude planodeSaude){
        totalPago += planodeSaude.getValor();
        
    }

}
