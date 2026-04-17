import java.util.Arrays;
import java.util.List;

public class ExemploArray {
    public static void main(String[] args) {
        List produtos = Arrays.asList("Celular", "TV", "Relógio", "Kindle");
        //Não posso adicionar novos elementos ao vetor
        //produtos.add("Som");
        //Posso modificar elementos existentes
        produtos.set(1, "TV 42");
        //produtos.remove(0);

        for (Object o : produtos) {
            System.out.println(o);
        }

    }
}