import java.io.File;
import java.util.Scanner;

public class ExemploLeituraPasta {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o nome da pasta ou nome do arquivo:");
        String nome = ler.nextLine();
    
        File file = new File(nome);
        if (file.exists()){
            if (file.isFile()) {
                System.out.printf("\\Arquivo %s existe - tamanho: %d em bytes\n", file.getName(),file.length());
            }else {
                System.out.println("Conteudo da pasta \n");
                String[] pasta = file.list();
                for (String item : pasta){
                    System.out.println("\n"+item);
                }
            
            }
        }else {
            System.out.println("Arquivo ou pasta não encontrado!");
        }
    
        ler.close();
    
    }


}
