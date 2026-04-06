public class TesteFuncionario {
    public static void main(String[] args) {

        Gerente gerente = new Gerente(123, "Ana", "1245", 5000, "123456", "ADM", 10);
        Diretor diretor = new Diretor(321, "Joao", "3214", 10000, "Producao");
        gerente.autenticacao("123");
        System.out.println(gerente.imprimirContraCheque());
        System.out.println(gerente.toString());

        gerente.reajustarSalario();
        System.out.println("Salario atualizado gerente: "+ gerente.getSalario());
        diretor.reajustarSalario();
        System.out.println("Salario atualizado do diretor: " + diretor.getSalario());

    }
}
