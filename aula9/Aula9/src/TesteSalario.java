public class TesteSalario {
    public static void main(String[] args) {
        //Vetor de objetos de funcionário
        String[] frutas = new String[2];
        frutas[0]= "Laranja";
        frutas[1]= "Abacaxi";

        Funcionario[] funcionarios = new Funcionario[2];

        funcionarios[0]= new Funcionario("Matheus", "Programador", 20000);
        funcionarios[1]= new Funcionario("Carla", "Fisioterapia", 5000);

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }

    }
}