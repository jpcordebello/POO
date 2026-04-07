public class TesteMaratona {

    public static void main(String[] args) {
        AtletaAmador atleta1 = new AtletaAmador("Joao","Masc" , 020,1.70 , true);
        AtletaAmador atleta2 = new AtletaAmador("Carla","Fem" , 017,1.95 , false);
        AtletaAmador atleta3 = new AtletaAmador("Marcelle","Fem" , 30,1.90 , true);
        AtletaProfissional atleta4 = new AtletaProfissional("Lucas", "Masc", 30, 1.90, 100);
        AtletaProfissional atleta5 = new AtletaProfissional("Caio", "Masc", 15, 1.60, 90);
        
        System.out.println("Atleta 1 - " + descobrirTipo(atleta1));
        System.out.println(atleta1);
        System.out.println(atleta1.verificarSituacao());

        System.out.println("-----------------");
        
        System.out.println("Atleta 2 - " + descobrirTipo(atleta2));
        System.out.println(atleta2);
        System.out.println(atleta2.verificarSituacao());

        System.out.println("-----------------");
        
        System.out.println("Atleta 3 - " + descobrirTipo(atleta3));
        System.out.println(atleta3);
        System.out.println(atleta3.verificarSituacao());

        System.out.println("-----------------");
        System.out.println("Atleta 4 - " + descobrirTipo(atleta4));
        System.out.println(atleta4);
        System.out.println(atleta4.verificarSituacao());

        System.out.println("-----------------");
        System.out.println("Atleta 5 - " + descobrirTipo(atleta5));
        System.out.println(atleta5);
        System.out.println(atleta1.verificarSituacao());

        System.out.println("--------fim---------");
    }

    public static String descobrirTipo(Maratona atleta){
        if (atleta instanceof AtletaAmador) {
            return"Amador";
        }else if (atleta instanceof AtletaProfissional){
            return "Profissional";
        }
        return "Tipo nao encontrado";
    }


}
