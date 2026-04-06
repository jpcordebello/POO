public class TesteAluno {
    public static void main(String[] args) {
        //instanciar - Criar um objeto em memoria
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        
        aluno1.nome = "José";
        aluno1.matricula  =123;
        aluno1.idade = 25;
        aluno1.nota1= 10;
        aluno1.nota2=7;
        System.out.println("Média "+aluno1.calcularMedia());
        


        aluno2.nome = "Maria";
        aluno2.matricula  =345;
        aluno2.idade = 22;

        aluno3.nome = "Joao";
        aluno3.matricula  =007;
        aluno3.idade = 38;

        System.out.println(aluno1.nome);
        System.out.println(aluno2.nome);
        System.out.println(aluno3.nome);
        
    }

}
