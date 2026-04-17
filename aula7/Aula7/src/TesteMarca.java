public class TesteMarca {
    public static void main(String[] args) {
        Equipamentos eq = new Equipamentos(1, "mouse", Marca.MICROSOFT);
    
        System.out.println(eq);

        System.out.println("*********Todas as Marcas**********");
        for (Marca m: Marca.values()) {
            System.out.println(m);
        }
    }
    
    
    
    }



    


