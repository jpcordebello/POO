import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        //File arquivo = new File("\\aula\\arquivo.txt");
        Scanner sc;
        try {
            sc = new Scanner(new File("\\aula\\arquivo.txt"),"UTF-8");
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
                
            }
            
        } catch (Exception e) {
            System.err.println("Arquivo nao encontrado");
        }
    }
}
