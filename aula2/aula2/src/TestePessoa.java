import java.util.Scanner;

public class TestePessoa {
    public static void main(String[] args) {
        var pessoa = new Pessoa();
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Código:");
        //pessoa.codigo = sc.nextInt();
        pessoa.setCodigo(sc.nextInt());

        System.out.println("Nome:");
        //pessoa.nome = sc.next();
        pessoa.setNome(sc.next());

        System.out.println("Altura:");
        //pessoa.altura= sc.nextDouble();
        pessoa.setAltura(sc.nextDouble());
        
        System.out.println("Peso:");
        //pessoa.peso= sc.nextDouble();
        pessoa.setPeso(sc.nextDouble());

        System.out.println(pessoa.getNome() +" está "+pessoa.resultado());

        sc.close();
    }

}
