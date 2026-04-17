import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExemploThrows {

    public static void main(String[] args) {
        try {
            FileReader leitura = new FileReader("\\aula\\teste.txt");
            System.out.println("Arquivo encontrado!");
            
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado!");
        }
    }
}