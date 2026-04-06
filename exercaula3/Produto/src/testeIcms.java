import java.util.Scanner;

public class testeIcms {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta = "N";

        while (!resposta.equalsIgnoreCase("S")) {

            System.out.println("Produto");
            String descricao = sc.nextLine();

            System.out.println("Valor");
            double valor = sc.nextDouble();

            System.out.println("Quantidade");
            int quantidade = sc.nextInt();

            Produto produto1 = new Produto(descricao, valor, quantidade);

            System.out.println("Descricao: " + produto1.getDescricao());
            System.out.println("Valor: " + produto1.getValor());
            System.out.println("Total: " + produto1.calcularTotal());
            System.out.println("Icms: " +String.format("%.2f", produto1.calcularIcms()));

            System.out.println("Deseja encerrar o programa? (S/N)");
            resposta = sc.next();
            sc.nextLine();

        }
        sc.close();

    }
}
