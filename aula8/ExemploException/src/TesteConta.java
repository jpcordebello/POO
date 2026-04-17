public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(123, "Maria", 2000);
        try {
            contaCorrente.deposito(100);
            contaCorrente.saque(5000);
        } catch (ContaException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Saldo atual é:" + contaCorrente.getSaldo());

        }
    }
}