import java.util.Scanner;

public class TesteConta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta1 conta = new Conta1();

        int continuar;

        do{

        //inferência
        //var conta2 = new Conta1();

        //var texto = "Aula";

        System.out.println("Digite o nº da conta:");
        //conta.numero=123;
        int numero = sc.nextInt();
        conta.numero= numero;

        System.out.println("Digite o seu nome:");
        String nome = sc.next();
        conta.titular = nome;


        //conta.titular="Joao";
        System.out.println("Digite o saldo da conta:");
        double saldo = sc.nextDouble();
        conta.saldo=saldo;

        System.out.println("Digite o valor do deposito:");
        double valor = sc.nextDouble();
        conta.depositar(valor);

        System.out.println("Digite o valor do seu saque");
        valor = sc.nextDouble();

        

       // conta.depositar(1000);

        if (conta.saque(valor)){
            System.out.println("Saque efetuado");
        }else {
            System.out.println("Saque nao efetuado");
        } 
        System.out.println("Saldo atual "+conta.saldo);

        System.out.println("Deseja continuar?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");

        continuar = sc.nextInt();

        if (continuar==2){
            System.out.println("Saindo do sistema");
        }

        } while (continuar ==1);

        sc.close();
    }

}
