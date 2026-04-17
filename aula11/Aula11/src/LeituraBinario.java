import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class LeituraBinario {
    public static void main(String[] args) {
        try {
            
        
        FileInputStream arquivo = new FileInputStream("\\aula\\arquivo.dat");
        DataInputStream ler = new DataInputStream(arquivo);
        String resultado = ler.readUTF();
        System.out.println(resultado);
        ler.close();
    } catch (IOException e) {
        System.err.println("Arquivo não encontrado!");
        e.printStackTrace();
        }
    }

}
