import java.util.Arrays;
import java.util.List;

public class ExemploGenerico2 {
    public static void main(String[] args) {
        List<Integer> inteiros = Arrays.asList(10, 50, 30, 40, 12);
        List<String> cores = Arrays.asList("Azul", "Vermelho", "Verde", "Branco");

        System.out.println("imprimir inteiros");
        imprimirLista(inteiros);
        System.out.println("imprimir cores");
        imprimirLista(cores);
    }

    public static void imprimirLista(List<?> lista){
        for (Object obj : lista) {
            System.out.println(obj);
        }
    }

}