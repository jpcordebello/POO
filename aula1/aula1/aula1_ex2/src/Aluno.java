public class Aluno {
    //Atributos
    int matricula, idade;
    String nome, telefone;
    double nota1,nota2;
        

    // Comportamentos - métodos
    // funcao sem retorno = void
    public void imprimir(){
        System.out.println("Bem vindo a escola!");

    }
    public double calcularMedia(){
        return(nota1+nota2)/2;
    }    
}
            
