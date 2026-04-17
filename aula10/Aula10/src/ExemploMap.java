import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        Map<String, String> estados = new HashMap<>();
        estados.put("AC", "Acre");
        estados.put("Rj", "Rio de janeiro");
        estados.put("MG", "Minas Gerais");
        estados.put("BA", "Bahia");
        for (String sigla : estados.keySet()) {
            System.out.println(sigla);
        }
        System.out.println("**********************");
        for (Map.Entry<String, String> tudo : estados.entrySet()) {
            System.out.println(tudo);
            System.out.println(tudo.getKey() + "-" + tudo.getValue());
        }
    }

}
