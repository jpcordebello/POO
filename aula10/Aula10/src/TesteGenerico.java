public class TesteGenerico {
    public static void main(String[] args) {
        Generico<Integer> generico = new Generico(50);
        Generico<String> generico2 = new Generico("Maria");
        Generico<Boolean> generico3 = new Generico(true);

        System.out.println(generico.getValor());
        System.out.println(generico2.getValor());
        System.out.println(generico3.getValor());
    }
}