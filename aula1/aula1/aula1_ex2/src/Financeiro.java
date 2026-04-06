import java.util.Scanner;

public class Financeiro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double saldo = 0;
        int opcao;

        do {

            System.out.println("\n=== SISTEMA FINANCEIRO ===");
            System.out.println("1 - Adicionar receita");
            System.out.println("2 - Adicionar despesa");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            switch(opcao) {

                case 1:
                    System.out.print("Valor da receita: ");
                    double receita = sc.nextDouble();
                    saldo = saldo + receita;
                    break;

                case 2:
                    System.out.print("Valor da despesa: ");
                    double despesa = sc.nextDouble();
                    saldo = saldo - despesa;
                    break;

                case 3:
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;

                case 4:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opcao inválida");

            }

        } while(opcao != 4);

        sc.close();

    }
}