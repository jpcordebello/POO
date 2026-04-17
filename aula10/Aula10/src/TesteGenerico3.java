import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteGenerico3 {
    public static void main(String[] args) {
        
        System.out.println("--- TESTE DE CURINGAS (PECS) ---");

        // 1. Nossas listas de origem (As que vão FORNECER os dados)
        List<Integer> inteiros = Arrays.asList(20, 30, 40, 60);
        List<Double> decimais = Arrays.asList(22.0, 35.0, 40.0, 90.0);
        
        // 2. Nossa lista de destino (A que vai RECEBER os dados)
        // Ela é de Object, que é a classe "Super" de todas. Perfeita para o <? super Number>
        List<Object> objetos = new ArrayList<>();

        // 3. Copiando os Inteiros para a lista de Objetos
        System.out.println("\nCopiando os Inteiros...");
        copiar(inteiros, objetos);
        imprimir(objetos);

        // 4. Copiando os Decimais para a MESMA lista de Objetos
        System.out.println("\nCopiando os Decimais...");
        copiar(decimais, objetos);
        
        // Imprime a lista final (vai ter os inteiros e os decimais tudo junto!)
        System.out.println("\nLista final de Objetos misturados:");
        imprimir(objetos);
    }

    // --- O MÉTODO MESTRE (PECS) ---
    // Origem (Extends): Fornece os dados
    // Destino (Super): Recebe os dados
    public static void copiar(List<? extends Number> origem, List<? super Number> destino) {
        for (Number numero : origem) {
            destino.add(numero); // Copia um por um
        }
    }

    // O método clássico de leitura
    public static void imprimir(List<?> lista) {
        for (Object obj : lista) {
            System.out.println("- " + obj);
        }
    }

}
