

public class TestePlano {
    public static void main(String[] args) {
        Clinica clinica = new Clinica("Amil", "123", "Checkup");
        Medicos medicos = new Medicos("Caberj", "122", "Carlos");
        Anestesista anestesista = new Anestesista("Cassi", "123", "José", "Raqui");
        ControlePagamento cp= new ControlePagamento();

        System.out.println(clinica);
        System.out.println("Valor pago: " + clinica.calcularPagamento());
        cp.calcularTotalPago(clinica);

        System.out.println(medicos);
        System.out.println("Valor pago ao medico: " +String.format("%.2f", medicos.calcularPagamento()));
        cp.calcularTotalPago(medicos);

        System.out.println(anestesista);
        System.out.println("Valor pago ao anestesista: " + String.format("%.2f" , anestesista.calcularPagamento()));
        cp.calcularTotalPago(anestesista);

        System.out.println("Total gasto: " + String.format("%.2f", cp.getTotalPago()));

    }

}
