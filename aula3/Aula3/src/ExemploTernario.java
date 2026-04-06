public class ExemploTernario {
    public static void main(String[] args) {
        boolean concluida = true;

        if (concluida){
            System.out.println("Tarefa concluida com sucesso");
        } else{
            System.out.println("Tarefa nao concluida");
        }
        System.out.println(concluida?"Tarefa concluida":"Tarefa nao concluida");

    }
}
