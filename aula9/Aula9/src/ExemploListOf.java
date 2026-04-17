import java.util.List;

public class ExemploListOf {
    public static void main(String[] args) {
        List produtos = List.of("Celular","TV","Relógio");

        for (Object object : produtos) {
            System.out.println(object);
            
        }
    }
}
