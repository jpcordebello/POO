import java.util.Scanner;
public class TesteProduto {
public static void main(String[] args) {
        
    // nova entrada de dados usando o construtor
    //new Produto();
    
    Produto produto = new Produto();
    Scanner sc = new Scanner(System.in);
    
    
    System.out.println("Digite o codigo:");
    produto.setCodigo(sc.nextInt());
    sc.nextLine(); // limpar buffer

    System.out.println("Digite o nome:");
    produto.setNome(sc.nextLine());

    System.out.println("Digite o preco");
    produto.setPreco(sc.nextDouble());

    System.out.println("produto cadastrado:");
    System.out.println("Codigo:"+produto.getCodigo());
    System.out.println("Nome:"+produto.getNome());
    System.out.println("Preco:"+produto.getPreco());

    sc.close();





}
}
