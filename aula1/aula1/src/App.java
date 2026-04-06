public class App {
    
    public static void main(String[] args) throws Exception {
        //tipos primitivos -  armazena valor
        int idade = 30;
        double altura = 1.6;
        boolean ativo = true;
        char opcao = 'S';

        //tipos classe 
        String nome = "José";
        Integer matricula;
        nome.toUpperCase();
            
        if (idade >= 18 || altura >=1.70) {
            System.out.println("O Atleta competirá");
        }else{
            System.out.println("O Atleta não competirá");
        }

    }

    //atributos e métodos
}