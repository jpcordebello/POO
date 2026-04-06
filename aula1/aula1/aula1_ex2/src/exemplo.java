public class exemplo {
    public static void main(String[] args) {
        int avaliacao=0;
        switch (avaliacao) {
            case 5:
                System.out.println("Excelente");
                break;
            case 3:
                System.out.println("Regular");
            case 2:
                System.out.println("Ruim");
            case 1:
                System.out.println("Péssimo");
            break;
            default:
                System.out.println("Sem resposta");
            break;
        }
    }
}
